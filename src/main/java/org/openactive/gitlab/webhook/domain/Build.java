package org.openactive.gitlab.webhook.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Build
{
   @JsonProperty("id")
   private long id;

   @JsonProperty("stage")
   private String stage;

   @JsonProperty("name")
   private String name;

   @JsonProperty("status")
   private String status;

   @JsonProperty("created_at")
   private String createdAt;

   @JsonProperty("started_at")
   private String startedAt;

   @JsonProperty("finished_at")
   private String finishedAt;

   @JsonProperty("when")
   private String when;

   @JsonProperty("manual")
   private boolean manual;

   @JsonProperty("runner")
   private Object runner;

   @JsonProperty("user")
   private User user;

   @JsonProperty("artifacts_file")
   private ArtifactsFile artifactsFile;


   public User getUser()
   {
      return user;
   }

   public void setUser( User user )
   {
      this.user = user;
   }

   public ArtifactsFile getArtifactsFile()
   {
      return artifactsFile;
   }

   public void setArtifactsFile( ArtifactsFile artifactsFile )
   {
      this.artifactsFile = artifactsFile;
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

   @JsonProperty("stage")
   public String getStage()
   {
      return stage;
   }

   @JsonProperty("stage")
   public void setStage( String stage )
   {
      this.stage = stage;
   }

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

   @JsonProperty("status")
   public String getStatus()
   {
      return status;
   }

   @JsonProperty("status")
   public void setStatus( String status )
   {
      this.status = status;
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

   @JsonProperty("started_at")
   public Object getStartedAt()
   {
      return startedAt;
   }

   @JsonProperty("started_at")
   public void setStartedAt( String startedAt )
   {
      this.startedAt = startedAt;
   }

   @JsonProperty("finished_at")
   public Object getFinishedAt()
   {
      return finishedAt;
   }

   @JsonProperty("finished_at")
   public void setFinishedAt( String finishedAt )
   {
      this.finishedAt = finishedAt;
   }

   @JsonProperty("when")
   public String getWhen()
   {
      return when;
   }

   @JsonProperty("when")
   public void setWhen( String when )
   {
      this.when = when;
   }

   @JsonProperty("manual")
   public boolean isManual()
   {
      return manual;
   }

   @JsonProperty("manual")
   public void setManual( boolean manual )
   {
      this.manual = manual;
   }

   @JsonProperty("runner")
   public Object getRunner()
   {
      return runner;
   }

   @JsonProperty("runner")
   public void setRunner( Object runner )
   {
      this.runner = runner;
   }
}