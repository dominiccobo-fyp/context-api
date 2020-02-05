package com.dominiccobo.fyp.context.models;

import java.util.Objects;

public class DocumentationTopic {

    private String topic;

    private DocumentationTopic() { }

    public DocumentationTopic(String topic) {
        this.topic = topic;
    }

    public final String getTopic() {
        return topic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentationTopic that = (DocumentationTopic) o;
        return topic.equals(that.topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic);
    }
}
