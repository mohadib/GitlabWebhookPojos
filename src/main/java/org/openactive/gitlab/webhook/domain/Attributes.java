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

   @JsonProperty("note")
   private String note;

   @JsonProperty("noteable_type")
   private String noteableType;

   @JsonProperty("project_id")
   private long projectId;

   @JsonProperty("attachment")
   private String attachment;

   @JsonProperty("line_code")
   private String lineCode;

   @JsonProperty("commit_id")
   private String commitId;

   @JsonProperty("noteable_id")
   private long noteableId;

   @JsonProperty("system")
   private boolean system;

   @JsonProperty("st_diff")
   private boolean stDiff;

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

   @JsonProperty("original_position")
   private Object position;

   @JsonProperty("position")
   private Object originalPosition;

   @JsonProperty("locked_at")
   private Object locked_at;

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

   @JsonProperty("updated_by_id")
   private Long updatedById;

   @JsonProperty("type")
   private String type;

   @JsonProperty("resolved_by_id")
   private Long resolvedById;

   @JsonProperty("resolved_at")
   private String resolvedAt;


   @JsonProperty("discussion_id")
   private String discussionId;

   @JsonProperty("merge_error")
   private Object mergeError;

   @JsonProperty("merge_params")
   private Object mergeParams;

   @JsonProperty("merge_when_pipeline_succeeds")
   private boolean mergeWhenPipelineSucceeds;

   @JsonProperty("merge_user_id")
   private Long mergeUserId;


   @JsonProperty("merge_commit_sha")
   private String mergeCommitSha;

   @JsonProperty("deleted_at")
   private String deletedAt;

   @JsonProperty("in_progress_merge_commit_sha")
   private String inProgressMergeCommitSha;

   @JsonProperty("lock_version")
   private Object lockVersion;

   @JsonProperty("time_estimate")
   private Object timeEstimate;

   @JsonProperty("total_time_spent")
   private Object totalTimeSpent;

   @JsonProperty("human_total_time_spent")
   private Object humanTotalTimeSpent;

   @JsonProperty("human_time_estimate")
   private Object humanTimeEstimate;

   public Object getTotalTimeSpent()
   {
      return totalTimeSpent;
   }

   public void setTotalTimeSpent( Object totalTimeSpent )
   {
      this.totalTimeSpent = totalTimeSpent;
   }

   public Object getHumanTotalTimeSpent()
   {
      return humanTotalTimeSpent;
   }

   public void setHumanTotalTimeSpent( Object humanTotalTimeSpent )
   {
      this.humanTotalTimeSpent = humanTotalTimeSpent;
   }

   public Object getHumanTimeEstimate()
   {
      return humanTimeEstimate;
   }

   public void setHumanTimeEstimate( Object humanTimeEstimate )
   {
      this.humanTimeEstimate = humanTimeEstimate;
   }

   public Object getTimeEstimate()
   {
      return timeEstimate;
   }

   public void setTimeEstimate( Object timeEstimate )
   {
      this.timeEstimate = timeEstimate;
   }

   public String getInProgressMergeCommitSha()
   {
      return inProgressMergeCommitSha;
   }

   public void setInProgressMergeCommitSha( String inProgressMergeCommitSha )
   {
      this.inProgressMergeCommitSha = inProgressMergeCommitSha;
   }

   public Object getLockVersion()
   {
      return lockVersion;
   }

   public void setLockVersion( Object lockVersion )
   {
      this.lockVersion = lockVersion;
   }

   public String getMergeCommitSha()
   {
      return mergeCommitSha;
   }

   public void setMergeCommitSha( String mergeCommitSha )
   {
      this.mergeCommitSha = mergeCommitSha;
   }

   public String getDeletedAt()
   {
      return deletedAt;
   }

   public void setDeletedAt( String deletedAt )
   {
      this.deletedAt = deletedAt;
   }

   public Object getMergeParams()
   {
      return mergeParams;
   }

   public void setMergeParams( Object mergeParams )
   {
      this.mergeParams = mergeParams;
   }

   public boolean isMergeWhenPipelineSucceeds()
   {
      return mergeWhenPipelineSucceeds;
   }

   public void setMergeWhenPipelineSucceeds( boolean mergeWhenPipelineSucceeds )
   {
      this.mergeWhenPipelineSucceeds = mergeWhenPipelineSucceeds;
   }

   public Long getMergeUserId()
   {
      return mergeUserId;
   }

   public void setMergeUserId( Long mergeUserId )
   {
      this.mergeUserId = mergeUserId;
   }

   public Object getMergeError()
   {
      return mergeError;
   }

   public void setMergeError( Object mergeError )
   {
      this.mergeError = mergeError;
   }

   public String getDiscussionId()
   {
      return discussionId;
   }

   public void setDiscussionId( String discussionId )
   {
      this.discussionId = discussionId;
   }

   public Long getResolvedById()
   {
      return resolvedById;
   }

   public void setResolvedById( Long resolvedById )
   {
      this.resolvedById = resolvedById;
   }

   public String getResolvedAt()
   {
      return resolvedAt;
   }

   public void setResolvedAt( String resolvedAt )
   {
      this.resolvedAt = resolvedAt;
   }

   public Object getOriginalPosition()
   {
      return originalPosition;
   }

   public void setOriginalPosition( Object originalPosition )
   {
      this.originalPosition = originalPosition;
   }

   public String getType()
   {
      return type;
   }

   public void setType( String type )
   {
      this.type = type;
   }

   public Long getUpdatedById()
   {
      return updatedById;
   }

   public void setUpdatedById( Long updatedById )
   {
      this.updatedById = updatedById;
   }

   public Object getPosition()
   {
      return position;
   }

   public void setPosition( Object position )
   {
      this.position = position;
   }

   public Object getLocked_at()
   {
      return locked_at;
   }

   public void setLocked_at( Object locked_at )
   {
      this.locked_at = locked_at;
   }

   public String getNote()
   {
      return note;
   }

   public void setNote( String note )
   {
      this.note = note;
   }

   public String getNoteableType()
   {
      return noteableType;
   }

   public void setNoteableType( String noteableType )
   {
      this.noteableType = noteableType;
   }

   public long getProjectId()
   {
      return projectId;
   }

   public void setProjectId( long projectId )
   {
      this.projectId = projectId;
   }

   public String getAttachment()
   {
      return attachment;
   }

   public void setAttachment( String attachment )
   {
      this.attachment = attachment;
   }

   public String getLineCode()
   {
      return lineCode;
   }

   public void setLineCode( String lineCode )
   {
      this.lineCode = lineCode;
   }

   public String getCommitId()
   {
      return commitId;
   }

   public void setCommitId( String commitId )
   {
      this.commitId = commitId;
   }

   public long getNoteableId()
   {
      return noteableId;
   }

   public void setNoteableId( long noteableId )
   {
      this.noteableId = noteableId;
   }

   public boolean isSystem()
   {
      return system;
   }

   public void setSystem( boolean system )
   {
      this.system = system;
   }

   public boolean isStDiff()
   {
      return stDiff;
   }

   public void setStDiff( boolean stDiff )
   {
      this.stDiff = stDiff;
   }

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
