package com.dominiccobo.fyp.context.models;


import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class ExpertTest {

    @Test
    public void testExpertBuilderPatternWithAllParams() {
        String EXPERT_NAME = "expert";
        String CONTACT_MODE = "facebook";
        String CONTACT_DETAILS = "fb.com/somerandomprofile";
        String EXPERT_TOPIC = "A Topic";
        String TOPIC_DESCRIPTION = "A Description of the expertise";
        Expert fixture = new Expert.Builder().setExpertName(EXPERT_NAME)
                .withContactDetails(new ContactDetails(CONTACT_MODE, CONTACT_DETAILS) {})
                .withExpertiseOn(new ExpertTopic(EXPERT_TOPIC, TOPIC_DESCRIPTION) {})
                .build();

        assertThat(fixture.getExpertName()).matches(EXPERT_NAME);
        assertThat(fixture.getContactDetails()).contains(new SampleContactDetails(CONTACT_MODE, CONTACT_DETAILS));
        assertThat(fixture.getExpertTopics().contains(new SampleExpertTopic(EXPERT_TOPIC, TOPIC_DESCRIPTION)));
    }

    @Test
    public void testExpertBuilderPatternWithExpertsWithNoContactDetails() {

        String EXPERT_NAME = "expert";
        String EXPERT_TOPIC = "A Topic";
        String TOPIC_DESCRIPTION = "A Description of the expertise";
        Expert fixture = new Expert.Builder().setExpertName(EXPERT_NAME)
                .withExpertiseOn(new ExpertTopic(EXPERT_TOPIC, TOPIC_DESCRIPTION) {})
                .build();

        assertThat(fixture.getExpertName()).matches(EXPERT_NAME);
        assertThat(fixture.getContactDetails()).isEmpty();
        assertThat(fixture.getExpertTopics().contains(new SampleExpertTopic(EXPERT_TOPIC, TOPIC_DESCRIPTION)));
    }

    private static class SampleContactDetails extends ContactDetails {

        SampleContactDetails(String meansName, String details) {
            super(meansName, details);
        }
    }

    private static class SampleExpertTopic extends ExpertTopic {
        SampleExpertTopic(String topicName, String description) {
            super(topicName, description);
        }
    }
}