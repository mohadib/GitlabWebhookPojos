package org.openactive.gitlab.webhook.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Author
{

   @JsonProperty("name")
   private String name;

   @JsonProperty("email")
   private String email;

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

   @JsonProperty("email")
   public String getEmail()
   {
      return email;
   }

   @JsonProperty("email")
   public void setEmail( String email )
   {
      this.email = email;
   }

}