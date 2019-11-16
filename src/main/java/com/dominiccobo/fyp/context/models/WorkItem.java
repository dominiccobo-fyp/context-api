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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkItem workItem = (WorkItem) o;

        if (!title.equals(workItem.title)) return false;
        return body.equals(workItem.body);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + body.hashCode();
        return result;
    }
}
