
package org.openactive.gitlab.webhook.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GitlabEvent
{
   @JsonProperty("object_kind")
   private String objectKind;

   @JsonProperty("before")
   private String before;

   @JsonProperty("after")
   private String after;

   @JsonProperty("ref")
   private String ref;

   @JsonProperty("checkout_sha")
   private String checkoutSha;

   @JsonProperty("user_id")
   private long userId;

   @JsonProperty("user_name")
   private String userName;

   @JsonProperty("user_email")
   private String userEmail;

   @JsonProperty("user_avatar")
   private String userAvatar;

   @JsonProperty("project_id")
   private long projectId;

   @JsonProperty("total_commits_count")
   private long totalCommitsCount;

   @JsonProperty("project")
   private Project project;

   @JsonProperty("repository")
   private Repository repository;

   @JsonProperty("commits")
   private List<Commit> commits;

   @JsonProperty("user")
   private User user;

   @JsonProperty("object_attributes")
   private Attributes attributes;

   @JsonProperty("object_attributes")
   public Attributes getAttributes()
   {
      return attributes;
   }

   @JsonProperty("object_attributes")
   public void setAttributes( Attributes attributes )
   {
      this.attributes = attributes;
   }

   @JsonProperty("user")
   public User getUser()
   {
      return user;
   }

   @JsonProperty("user")
   public void setUser( User user )
   {
      this.user = user;
   }

   @JsonProperty("commits")
   public List<Commit> getCommits()
   {
      return commits;
   }

   @JsonProperty("commits")
   public void setCommits( List<Commit> commits )
   {
      this.commits = commits;
   }

   @JsonProperty("repository")
   public Repository getRepository()
   {
      return repository;
   }

   @JsonProperty("repository")
   public void setRepository( Repository repository )
   {
      this.repository = repository;
   }

   @JsonProperty("project")
   public Project getProject()
   {
      return project;
   }

   @JsonProperty("project")
   public void setProject( Project project )
   {
      this.project = project;
   }

   @JsonProperty("object_kind")
   public String getObjectKind()
   {
      return objectKind;
   }

   @JsonProperty("object_kind")
   public void setObjectKind( String objectKind )
   {
      this.objectKind = objectKind;
   }

   @JsonProperty("before")
   public String getBefore()
   {
      return before;
   }

   @JsonProperty("before")
   public void setBefore( String before )
   {
      this.before = before;
   }

   @JsonProperty("after")
   public String getAfter()
   {
      return after;
   }

   @JsonProperty("after")
   public void setAfter( String after )
   {
      this.after = after;
   }

   @JsonProperty("ref")
   public String getRef()
   {
      return ref;
   }

   @JsonProperty("ref")
   public void setRef( String ref )
   {
      this.ref = ref;
   }

   @JsonProperty("checkout_sha")
   public String getCheckoutSha()
   {
      return checkoutSha;
   }

   @JsonProperty("checkout_sha")
   public void setCheckoutSha( String checkoutSha )
   {
      this.checkoutSha = checkoutSha;
   }

   @JsonProperty("user_id")
   public long getUserId()
   {
      return userId;
   }

   @JsonProperty("user_id")
   public void setUserId( long userId )
   {
      this.userId = userId;
   }

   @JsonProperty("user_name")
   public String getUserName()
   {
      return userName;
   }

   @JsonProperty("user_name")
   public void setUserName( String userName )
   {
      this.userName = userName;
   }

   @JsonProperty("user_email")
   public String getUserEmail()
   {
      return userEmail;
   }

   @JsonProperty("user_email")
   public void setUserEmail( String userEmail )
   {
      this.userEmail = userEmail;
   }

   @JsonProperty("user_avatar")
   public String getUserAvatar()
   {
      return userAvatar;
   }

   @JsonProperty("user_avatar")
   public void setUserAvatar( String userAvatar )
   {
      this.userAvatar = userAvatar;
   }

   @JsonProperty("project_id")
   public long getProjectId()
   {
      return projectId;
   }

   @JsonProperty("project_id")
   public void setProjectId( long projectId )
   {
      this.projectId = projectId;
   }

   @JsonProperty("total_commits_count")
   public long getTotalCommitsCount()
   {
      return totalCommitsCount;
   }

   @JsonProperty("total_commits_count")
   public void setTotalCommitsCount( long totalCommitsCount )
   {
      this.totalCommitsCount = totalCommitsCount;
   }

}