package org.openactive.gitlab.webhook.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class TestMarshalling
{

   @Test
   public void testMarshallMROpen() throws IOException
   {
      ObjectMapper mapper = new ObjectMapper();
      GitlabEvent event = mapper.readValue( TestMarshalling.class.getResource( "/mr_open.json" ), GitlabEvent.class );
      assertNotNull( event );
      assertEquals( "merge_request", event.getObjectKind() );
   }

   @Test
   public void testMarshallPiplineEvent() throws IOException
   {
      ObjectMapper mapper = new ObjectMapper();
      GitlabEvent event = mapper.readValue( TestMarshalling.class.getResource( "/pipeline.json" ), GitlabEvent.class );
      assertNotNull( event );
      assertEquals( "pipeline", event.getObjectKind() );
      assertEquals( 5, event.getBuilds().size() );
      assertEquals( 380, event.getBuilds().get( 0 ).getId() );
      assertEquals( "success", event.getAttributes().getStatus() );
      assertEquals( 63, event.getAttributes().getDuration() );
   }

   @Test
   public void testMarshallCommentEvent() throws IOException
   {
      ObjectMapper mapper = new ObjectMapper();
      GitlabEvent event = mapper.readValue( TestMarshalling.class.getResource( "/mr_comment.json" ), GitlabEvent.class );
      assertNotNull( event );
      assertEquals( "note", event.getObjectKind() );
      assertEquals( "MergeRequest", event.getAttributes().getNoteableType() );
      assertEquals( "This MR needs work.", event.getAttributes().getNote() );
   }

}
