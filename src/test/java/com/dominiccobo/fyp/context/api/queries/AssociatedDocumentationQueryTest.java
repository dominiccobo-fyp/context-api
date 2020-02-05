package com.dominiccobo.fyp.context.api.queries;

import com.dominiccobo.fyp.context.models.DocumentationType;
import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.fail;

public class AssociatedDocumentationQueryTest {

   private AssociatedDocumentationQuery.Builder fixture;

   @Before
   public void setUp() throws Exception {
      fixture = new AssociatedDocumentationQuery.Builder(null, null);
   }

   @Test
   public void givenBuilder_whenAppendDocumentationTypeAndBuild_objectHasDocumentationType() {
      DocumentationType expectedType = DocumentationType.QA;
      fixture.forDocumentationType(expectedType);
      AssociatedDocumentationQuery built = buildWithSearchTypeFieldAppended();
      assertThat(built.getDocumentationTypes()).containsExactly(expectedType);
   }

   @Test
   public void givenBuilder_whenAppendMultipleDocumentationTypeAndBuild_objectHasDocumentationTypes() {
      DocumentationType expectedType = DocumentationType.QA;
      DocumentationType expectedType2 = DocumentationType.WIKI;
      fixture.forDocumentationType(expectedType).forDocumentationType(expectedType2);
      AssociatedDocumentationQuery built = buildWithSearchTypeFieldAppended();
      assertThat(built.getDocumentationTypes()).containsExactly(expectedType, expectedType2);
   }

   private AssociatedDocumentationQuery buildWithSearchTypeFieldAppended() {
      fixture.forSearchTerm("My search term");
      return fixture.build();
   }

   @Test
   public void givenBuilder_whenAppendNoDocumentationTypeAndBuild_throwErrorOnBuild() {
      try {
         fixture.build();
         fail("Exception was expected");
      }
      catch (IllegalStateException e) {
         assertThat(e.getMessage()).matches(AssociatedDocumentationQuery.Builder.MUST_SPECIFY_DOC_TYPE_ERROR);
      }
   }

   @Test
   public void givenBuilder_whenNoSearchTermAppendedAndOtherFieldsCompleteAndBuild_throwErrorOnBuild() {
      fixture.forDocumentationType(DocumentationType.QA);
      try {
         fixture.build();
         fail("Exception was expected");
      }
      catch (IllegalStateException e) {
         assertThat(e.getMessage()).matches(AssociatedDocumentationQuery.Builder.MUST_SPECIFY_SEARCH_TERM_ERROR);
      }
   }
}
