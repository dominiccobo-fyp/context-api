package com.dominiccobo.fyp.context.models;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class DocumentationTest {

    private Documentation.Builder fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new Documentation.Builder();
    }

    @Test
    public void givenBuilder_whenAppendTitleAndBuild_objectHasTitle() {
        String expectedTitle = "Test Title";
        fixture.setTitle(expectedTitle);
        Documentation built = fixture.build();
        assertThat(built.getTitle()).matches(expectedTitle);
    }

    @Test
    public void givenBuilder_whenAppendContentAndBuild_objectHasContent() {
        String expectedContent = "my really long content on something here we go ...";
        fixture.setContent(expectedContent);
        Documentation built = fixture.build();
        assertThat(built.getContent()).matches(expectedContent);
    }

    @Test
    public void givenBuilder_whenAppendTypeAndBuild_objectHasType () {
        DocumentationType expectedType = DocumentationType.QA;
        fixture.setType(expectedType);
        Documentation built = fixture.build();
        assertThat(built.getType()).isEqualTo(expectedType);

    }

    @Test
    public void givenBuilder_whenAppendTopic_objectContainsTopic() {
        DocumentationTopic expectedTopic = new DocumentationTopic("Something");
        fixture.withTopic(expectedTopic);
        Documentation built = fixture.build();
        assertThat(built.getTopic()).contains(expectedTopic);
    }

    @Test
    public void givenBuilder_whenAppendMultipleTopics_objectContainsMultipleTopics() {
        DocumentationTopic expectedTopic = new DocumentationTopic("Something");
        DocumentationTopic expectedTopic2 = new DocumentationTopic("Something 2");
        fixture.withTopic(expectedTopic).withTopic(expectedTopic2);
        Documentation built = fixture.build();
        assertThat(built.getTopic()).containsExactly(expectedTopic, expectedTopic2);
    }

    @Test
    public void givenBuilder_whenAppendNoTopics_objectContainsEmptyTopicList() {
        Documentation built = fixture.build();
        assertThat(built.getTopic()).isNotNull();
        assertThat(built.getTopic()).isEmpty();
    }

    @Test
    public void givenBuilder_whenAppendLink_objectContainsLink() {
        String expectedLink = "https://example.com/bananas";
        fixture.setLink(expectedLink);
        Documentation built = fixture.build();
        assertThat(built.getLink()).matches(expectedLink);
    }

    @Test
    public void givenBuilder_whenAppendTitle_objectHasTitle() {
        String expectedTitle = "My Long Title About Something";
        fixture.setTitle(expectedTitle);
        Documentation built = fixture.build();
        assertThat(built.getTitle()).matches(expectedTitle);
    }

    @Test
    public void givenBuilder_whenAppendLastActivity_objectHasLastActivity() {
        String lastActivity = "DD/MM/YYYY HH:MM";
        fixture.setLastActivity(lastActivity);
        Documentation build = fixture.build();
        assertThat(build.getLastActivity()).matches(lastActivity);
    }
}
