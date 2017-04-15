package org.openactive.gitlab.webhook.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Assignee
{

   @JsonProperty("name")
   private String name;

   @JsonProperty("username")
   private String username;

   @JsonProperty("avatar_url")
   private String avatarUrl;

   @JsonProperty("name")
   public String getName()
   {
      return name;
   }

   @JsonProperty("name")
   public void setName( String name )
   {
      this.name = name;
   }

   @JsonProperty("username")
   public String getUsername()
   {
      return username;
   }

   @JsonProperty("username")
   public void setUsername( String username )
   {
      this.username = username;
   }

   @JsonProperty("avatar_url")
   public String getAvatarUrl()
   {
      return avatarUrl;
   }

   @JsonProperty("avatar_url")
   public void setAvatarUrl( String avatarUrl )
   {
      this.avatarUrl = avatarUrl;
   }

}