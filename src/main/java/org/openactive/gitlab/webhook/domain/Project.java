package org.openactive.gitlab.webhook.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Project
{
   @JsonProperty("name")
   private String name;

   @JsonProperty("description")
   private String description;

   @JsonProperty("web_url")
   private String webUrl;

   @JsonProperty("avatar_url")
   private Object avatarUrl;

   @JsonProperty("git_ssh_url")
   private String gitSshUrl;

   @JsonProperty("git_http_url")
   private String gitHttpUrl;

   @JsonProperty("namespace")
   private String namespace;

   @JsonProperty("visibility_level")
   private long visibilityLevel;

   @JsonProperty("path_with_namespace")
   private String pathWithNamespace;

   @JsonProperty("default_branch")
   private String defaultBranch;

   @JsonProperty("homepage")
   private String homepage;

   @JsonProperty("url")
   private String url;

   @JsonProperty("ssh_url")
   private String sshUrl;

   @JsonProperty("http_url")
   private String httpUrl;

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

   @JsonProperty("web_url")
   public String getWebUrl()
   {
      return webUrl;
   }

   @JsonProperty("web_url")
   public void setWebUrl( String webUrl )
   {
      this.webUrl = webUrl;
   }

   @JsonProperty("avatar_url")
   public Object getAvatarUrl()
   {
      return avatarUrl;
   }

   @JsonProperty("avatar_url")
   public void setAvatarUrl( Object avatarUrl )
   {
      this.avatarUrl = avatarUrl;
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

   @JsonProperty("namespace")
   public String getNamespace()
   {
      return namespace;
   }

   @JsonProperty("namespace")
   public void setNamespace( String namespace )
   {
      this.namespace = namespace;
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

   @JsonProperty("path_with_namespace")
   public String getPathWithNamespace()
   {
      return pathWithNamespace;
   }

   @JsonProperty("path_with_namespace")
   public void setPathWithNamespace( String pathWithNamespace )
   {
      this.pathWithNamespace = pathWithNamespace;
   }

   @JsonProperty("default_branch")
   public String getDefaultBranch()
   {
      return defaultBranch;
   }

   @JsonProperty("default_branch")
   public void setDefaultBranch( String defaultBranch )
   {
      this.defaultBranch = defaultBranch;
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

   @JsonProperty("ssh_url")
   public String getSshUrl()
   {
      return sshUrl;
   }

   @JsonProperty("ssh_url")
   public void setSshUrl( String sshUrl )
   {
      this.sshUrl = sshUrl;
   }

   @JsonProperty("http_url")
   public String getHttpUrl()
   {
      return httpUrl;
   }

   @JsonProperty("http_url")
   public void setHttpUrl( String httpUrl )
   {
      this.httpUrl = httpUrl;
   }

}