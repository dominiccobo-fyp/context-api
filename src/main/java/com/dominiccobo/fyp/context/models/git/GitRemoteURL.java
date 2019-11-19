package com.dominiccobo.fyp.context.models.git;

import com.fasterxml.jackson.annotation.JsonCreator;

public class GitRemoteURL {

    private String url;

    @JsonCreator
    private GitRemoteURL() {}

    public GitRemoteURL(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
