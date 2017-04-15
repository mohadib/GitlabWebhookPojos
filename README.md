# GitlabWebhookPojos
Pojos for marshaling Gitlab webhook events.

Currently only fully works for Push and Merge request events.
Uses Jackson.

```java
package com.tlc;

import org.openactive.gitlab.webhook.domain.GitlabEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@ComponentScan
public class Main
{

   @Autowired
   private SlackBot bot;

   @RequestMapping("/")
   @ResponseBody
   public String index( @RequestBody GitlabEvent event )
   {
      if( "merge_request".equalsIgnoreCase( event.getObjectKind() ) )
      {
         mergeRequestEvent( event );
      }
      return "ok";
   }

   private void mergeRequestEvent( GitlabEvent event )
   {
      String projectName = event.getAttributes().getTarget().getName();
      String userName = event.getUser().getName();
      String sourceBranchName = event.getAttributes().getSourceBranch();
      String targetBranchName = event.getAttributes().getTargetBranch();
      String state = event.getAttributes().getState();
      String msg = "";

      if( "opened".equalsIgnoreCase( state ) )
      {
         msg = String.format( "%s: *Merge request* from %s : Merge %s to %s", projectName, userName, sourceBranchName, targetBranchName );
         msg += "\n" + event.getAttributes().getUrl();
      }
      else if( "closed".equalsIgnoreCase( state ) )
      {
         msg = String.format( "%s: Merge request from %s *closed*", projectName, userName );
      }
      else if( "merged".equalsIgnoreCase( state ) )
      {
         msg = String.format( "%s: Merge request from %s *merged*", projectName, userName );
      }

      bot.say( msg );
   }

   public static void main( String[] args )
   {
      SpringApplication.run( Main.class, args );
   }
}
```