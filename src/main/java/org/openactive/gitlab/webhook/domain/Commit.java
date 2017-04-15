package org.openactive.gitlab.webhook.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Commit
{
   @JsonProperty("id")
   private String id;

   @JsonProperty("message")
   private String message;

   @JsonProperty("timestamp")
   private String timestamp;

   @JsonProperty("url")
   private String url;

   @JsonProperty("added")
   private List<String> added = null;

   @JsonProperty("modified")
   private List<String> modified = null;

   @JsonProperty("removed")
   private List<String> removed = null;

   @JsonProperty("author")
   private Author author;


   @JsonProperty("author")
   public Author getAuthor()
   {
      return author;
   }

   @JsonProperty("author")
   public void setAuthor( Author author )
   {
      this.author = author;
   }

   @JsonProperty("id")
   public String getId()
   {
      return id;
   }

   @JsonProperty("id")
   public void setId( String id )
   {
      this.id = id;
   }

   @JsonProperty("message")
   public String getMessage()
   {
      return message;
   }

   @JsonProperty("message")
   public void setMessage( String message )
   {
      this.message = message;
   }

   @JsonProperty("timestamp")
   public String getTimestamp()
   {
      return timestamp;
   }

   @JsonProperty("timestamp")
   public void setTimestamp( String timestamp )
   {
      this.timestamp = timestamp;
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

   @JsonProperty("added")
   public List<String> getAdded()
   {
      return added;
   }

   @JsonProperty("added")
   public void setAdded( List<String> added )
   {
      this.added = added;
   }

   @JsonProperty("modified")
   public List<String> getModified()
   {
      return modified;
   }

   @JsonProperty("modified")
   public void setModified( List<String> modified )
   {
      this.modified = modified;
   }

   @JsonProperty("removed")
   public List<String> getRemoved()
   {
      return removed;
   }

   @JsonProperty("removed")
   public void setRemoved( List<String> removed )
   {
      this.removed = removed;
   }

}