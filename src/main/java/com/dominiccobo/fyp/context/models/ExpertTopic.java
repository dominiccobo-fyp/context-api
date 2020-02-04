package com.dominiccobo.fyp.context.models;

public class ExpertTopic {
    private String topicName;
    private String description;

    private ExpertTopic() {}

    public ExpertTopic(String topicName, String description) {
        this.topicName = topicName;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        ExpertTopic that = (ExpertTopic) o;

        if (topicName != null ? !topicName.equals(that.topicName) : that.topicName != null) return false;
        return description != null ? description.equals(that.description) : that.description == null;
    }

    @Override
    public int hashCode() {
        int result = topicName != null ? topicName.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    public final String getTopicName() {
        return topicName;
    }

    public final String getDescription() {
        return description;
    }
}
