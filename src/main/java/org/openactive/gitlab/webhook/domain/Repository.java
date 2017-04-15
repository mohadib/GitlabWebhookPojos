package org.openactive.gitlab.webhook.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Repository
{

   @JsonProperty("name")
   private String name;

   @JsonProperty("url")
   private String url;

   @JsonProperty("description")
   private String description;

   @JsonProperty("homepage")
   private String homepage;

   @JsonProperty("git_http_url")
   private String gitHttpUrl;

   @JsonProperty("git_ssh_url")
   private String gitSshUrl;

   @JsonProperty("visibility_level")
   private long visibilityLevel;

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

   @JsonProperty("url")
   public String getUrl()
   {
      return url;
   }

   @JsonProperty("url")
   public void setUrl( String url )
   {
      this.url = url;
   }

   @JsonProperty("description")
   public String getDescription()
   {
      return description;
   }

   @JsonProperty("description")
   public void setDescription( String description )
   {
      this.description = description;
   }

   @JsonProperty("homepage")
   public String getHomepage()
   {
      return homepage;
   }

   @JsonProperty("homepage")
   public void setHomepage( String homepage )
   {
      this.homepage = homepage;
   }

   @JsonProperty("git_http_url")
   public String getGitHttpUrl()
   {
      return gitHttpUrl;
   }

   @JsonProperty("git_http_url")
   public void setGitHttpUrl( String gitHttpUrl )
   {
      this.gitHttpUrl = gitHttpUrl;
   }

   @JsonProperty("git_ssh_url")
   public String getGitSshUrl()
   {
      return gitSshUrl;
   }

   @JsonProperty("git_ssh_url")
   public void setGitSshUrl( String gitSshUrl )
   {
      this.gitSshUrl = gitSshUrl;
   }

   @JsonProperty("visibility_level")
   public long getVisibilityLevel()
   {
      return visibilityLevel;
   }

   @JsonProperty("visibility_level")
   public void setVisibilityLevel( long visibilityLevel )
   {
      this.visibilityLevel = visibilityLevel;
   }
}