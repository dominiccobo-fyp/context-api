package com.dominiccobo.fyp.context.models;

import java.util.Optional;

public class WorkItem {

    private String title;
    private String body;

    public WorkItem setTitle(String title) {
        this.title = title;
        return this;
    }

    public Optional<String> getBody() {
        return Optional.ofNullable(body);
    }

    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }

    public WorkItem setBody(String body) {
        this.body = body;
        return this;
    }
}
