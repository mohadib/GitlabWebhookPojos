package org.openactive.gitlab.webhook.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArtifactsFile
{
   @JsonProperty("filename")
   private String filename;

   @JsonProperty("size")
   private long size;

   @JsonProperty("filename")
   public String getFilename()
   {
      return filename;
   }

   @JsonProperty("filename")
   public void setFilename( String filename )
   {
      this.filename = filename;
   }

   @JsonProperty("size")
   public long getSize()
   {
      return size;
   }

   @JsonProperty("size")
   public void setSize( long size )
   {
      this.size = size;
   }
}