package org.openactive.gitlab.webhook.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Attributes
{
   @JsonProperty("id")
   private long id;

   @JsonProperty("ref")
   private String ref;

   @JsonProperty("tag")
   private boolean tag;

   @JsonProperty("sha")
   private String sha;

   @JsonProperty("before_sha")
   private String beforeSha;

   @JsonProperty("status")
   private String status;

   @JsonProperty("stages")
   private List<String> stages;

   @JsonProperty("finished_at")
   private String finishedAt;

   @JsonProperty("duration")
   private long duration;

   @JsonProperty("target_branch")
   private String targetBranch;

   @JsonProperty("source_branch")
   private String sourceBranch;

   @JsonProperty("source_project_id")
   private long sourceProjectId;

   @JsonProperty("author_id")
   private long authorId;

   @JsonProperty("assignee_id")
   private long assigneeId;

   @JsonProperty("title")
   private String title;

   @JsonProperty("created_at")
   private String createdAt;

   @JsonProperty("updated_at")
   private String updatedAt;

   @JsonProperty("st_commits")
   private Object stCommits;

   @JsonProperty("st_diffs")
   private Object stDiffs;

   @JsonProperty("milestone_id")
   private Object milestoneId;

   @JsonProperty("state")
   private String state;

   @JsonProperty("merge_status")
   private String mergeStatus;

   @JsonProperty("target_project_id")
   private long targetProjectId;

   @JsonProperty("iid")
   private long iid;

   @JsonProperty("description")
   private String description;

   @JsonProperty("work_in_progress")
   private boolean workInProgress;

   @JsonProperty("url")
   private String url;

   @JsonProperty("action")
   private String action;

   @JsonProperty("source")
   private Project source;

   @JsonProperty("target")
   private Project target;

   @JsonProperty("last_commit")
   private Commit lastCommit;

   @JsonProperty("assignee")
   private Assignee assignee;


   public String getRef()
   {
      return ref;
   }

   public void setRef( String ref )
   {
      this.ref = ref;
   }

   public boolean isTag()
   {
      return tag;
   }

   public void setTag( boolean tag )
   {
      this.tag = tag;
   }

   public String getSha()
   {
      return sha;
   }

   public void setSha( String sha )
   {
      this.sha = sha;
   }

   public String getBeforeSha()
   {
      return beforeSha;
   }

   public void setBeforeSha( String beforeSha )
   {
      this.beforeSha = beforeSha;
   }

   public String getStatus()
   {
      return status;
   }

   public void setStatus( String status )
   {
      this.status = status;
   }

   public List<String> getStages()
   {
      return stages;
   }

   public void setStages( List<String> stages )
   {
      this.stages = stages;
   }

   public String getFinishedAt()
   {
      return finishedAt;
   }

   public void setFinishedAt( String finishedAt )
   {
      this.finishedAt = finishedAt;
   }

   public long getDuration()
   {
      return duration;
   }

   public void setDuration( long duration )
   {
      this.duration = duration;
   }

   @JsonProperty("assignee")
   public Assignee getAssignee()
   {
      return assignee;
   }

   @JsonProperty("assignee")
   public void setAssignee( Assignee assignee )
   {
      this.assignee = assignee;
   }

   @JsonProperty("last_commit")
   public Commit getLastCommit()
   {
      return lastCommit;
   }

   @JsonProperty("last_commit")
   public void setLastCommit( Commit lastCommit )
   {
      this.lastCommit = lastCommit;
   }

   @JsonProperty("source")
   public Project getSource()
   {
      return source;
   }

   @JsonProperty("source")
   public void setSource( Project source )
   {
      this.source = source;
   }

   @JsonProperty("target")
   public Project getTarget()
   {
      return target;
   }

   @JsonProperty("target")
   public void setTarget( Project target )
   {
      this.target = target;
   }

   @JsonProperty("id")
   public long getId()
   {
      return id;
   }

   @JsonProperty("id")
   public void setId( long id )
   {
      this.id = id;
   }

   @JsonProperty("target_branch")
   public String getTargetBranch()
   {
      return targetBranch;
   }

   @JsonProperty("target_branch")
   public void setTargetBranch( String targetBranch )
   {
      this.targetBranch = targetBranch;
   }

   @JsonProperty("source_branch")
   public String getSourceBranch()
   {
      return sourceBranch;
   }

   @JsonProperty("source_branch")
   public void setSourceBranch( String sourceBranch )
   {
      this.sourceBranch = sourceBranch;
   }

   @JsonProperty("source_project_id")
   public long getSourceProjectId()
   {
      return sourceProjectId;
   }

   @JsonProperty("source_project_id")
   public void setSourceProjectId( long sourceProjectId )
   {
      this.sourceProjectId = sourceProjectId;
   }

   @JsonProperty("author_id")
   public long getAuthorId()
   {
      return authorId;
   }

   @JsonProperty("author_id")
   public void setAuthorId( long authorId )
   {
      this.authorId = authorId;
   }

   @JsonProperty("assignee_id")
   public long getAssigneeId()
   {
      return assigneeId;
   }

   @JsonProperty("assignee_id")
   public void setAssigneeId( long assigneeId )
   {
      this.assigneeId = assigneeId;
   }

   @JsonProperty("title")
   public String getTitle()
   {
      return title;
   }

   @JsonProperty("title")
   public void setTitle( String title )
   {
      this.title = title;
   }

   @JsonProperty("created_at")
   public String getCreatedAt()
   {
      return createdAt;
   }

   @JsonProperty("created_at")
   public void setCreatedAt( String createdAt )
   {
      this.createdAt = createdAt;
   }

   @JsonProperty("updated_at")
   public String getUpdatedAt()
   {
      return updatedAt;
   }

   @JsonProperty("updated_at")
   public void setUpdatedAt( String updatedAt )
   {
      this.updatedAt = updatedAt;
   }

   @JsonProperty("st_commits")
   public Object getStCommits()
   {
      return stCommits;
   }

   @JsonProperty("st_commits")
   public void setStCommits( Object stCommits )
   {
      this.stCommits = stCommits;
   }

   @JsonProperty("st_diffs")
   public Object getStDiffs()
   {
      return stDiffs;
   }

   @JsonProperty("st_diffs")
   public void setStDiffs( Object stDiffs )
   {
      this.stDiffs = stDiffs;
   }

   @JsonProperty("milestone_id")
   public Object getMilestoneId()
   {
      return milestoneId;
   }

   @JsonProperty("milestone_id")
   public void setMilestoneId( Object milestoneId )
   {
      this.milestoneId = milestoneId;
   }

   @JsonProperty("state")
   public String getState()
   {
      return state;
   }

   @JsonProperty("state")
   public void setState( String state )
   {
      this.state = state;
   }

   @JsonProperty("merge_status")
   public String getMergeStatus()
   {
      return mergeStatus;
   }

   @JsonProperty("merge_status")
   public void setMergeStatus( String mergeStatus )
   {
      this.mergeStatus = mergeStatus;
   }

   @JsonProperty("target_project_id")
   public long getTargetProjectId()
   {
      return targetProjectId;
   }

   @JsonProperty("target_project_id")
   public void setTargetProjectId( long targetProjectId )
   {
      this.targetProjectId = targetProjectId;
   }

   @JsonProperty("iid")
   public long getIid()
   {
      return iid;
   }

   @JsonProperty("iid")
   public void setIid( long iid )
   {
      this.iid = iid;
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

   @JsonProperty("work_in_progress")
   public boolean isWorkInProgress()
   {
      return workInProgress;
   }

   @JsonProperty("work_in_progress")
   public void setWorkInProgress( boolean workInProgress )
   {
      this.workInProgress = workInProgress;
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

   @JsonProperty("action")
   public String getAction()
   {
      return action;
   }

   @JsonProperty("action")
   public void setAction( String action )
   {
      this.action = action;
   }

}