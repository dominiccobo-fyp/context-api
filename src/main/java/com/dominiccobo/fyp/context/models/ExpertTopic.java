package com.dominiccobo.fyp.context.models;

public abstract class ExpertTopic {
    private final String topicName;
    private final String description;

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
}
