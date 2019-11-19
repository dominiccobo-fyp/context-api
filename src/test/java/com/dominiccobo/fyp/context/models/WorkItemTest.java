package com.dominiccobo.fyp.context.models;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class WorkItemTest {

    @Test
    public void testWorkItemBuilderWithAllParams() {
        String MY_WORK_ITEM_TITLE = "title";
        String MY_WORK_ITEM_BODY = "body";
        WorkItem workItem = new WorkItem.Builder()
                .setTitle(MY_WORK_ITEM_TITLE)
                .setBody(MY_WORK_ITEM_BODY).build();

        assertThat(workItem.getTitle().isPresent()).isTrue();
        assertThat(workItem.getTitle().get()).matches((MY_WORK_ITEM_TITLE));
        assertThat(workItem.getBody().isPresent()).isTrue();
        assertThat(workItem.getBody().get()).matches(MY_WORK_ITEM_BODY);
    }
}
