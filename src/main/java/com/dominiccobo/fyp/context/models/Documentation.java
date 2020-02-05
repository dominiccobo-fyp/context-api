package com.dominiccobo.fyp.context.models;

import java.util.ArrayList;
import java.util.List;

public class Documentation {
    private String title;
    private String content;
    private String link;
    private String lastActivity;
    private DocumentationType type;
    private List<DocumentationTopic> topic = new ArrayList<>();

    private Documentation() {}

    public final static class Builder {

        private Documentation objectUnderConstruction = new Documentation();

        public Builder() {}

        public final Documentation build() {
            return objectUnderConstruction;
        }

        public Builder setTitle(String title) {
            this.objectUnderConstruction.title = title;
            return this;
        }

        public Builder setContent(String content) {
            this.objectUnderConstruction.content = content;
            return this;
        }

        public Builder setLink(String link) {
            this.objectUnderConstruction.link = link;
            return this;
        }

        public Builder setLastActivity(String lastActivity) {
            this.objectUnderConstruction.lastActivity = lastActivity;
            return this;
        }

        public Builder withTopic(DocumentationTopic topic) {
            this.objectUnderConstruction.topic.add(topic);
            return this;
        }

        public Builder setType(DocumentationType docType) {
            this.objectUnderConstruction.type = docType;
            return this;
        }

    }

    public final String getTitle() {
        return title;
    }

    public final String getContent() {
        return content;
    }

    public final String getLink() {
        return link;
    }

    public final String getLastActivity() {
        return lastActivity;
    }

    public final DocumentationType getType() {
        return type;
    }

    public final List<DocumentationTopic> getTopic() {
        return topic;
    }
}
