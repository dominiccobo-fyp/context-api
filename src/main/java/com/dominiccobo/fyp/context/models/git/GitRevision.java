package com.dominiccobo.fyp.context.models.git;

import com.fasterxml.jackson.annotation.JsonCreator;

public class GitRevision {
    private String revision;
    private String branch;

    @JsonCreator
    private GitRevision() {}

    public GitRevision(String revision, String branch) {
        this.revision = revision;
        this.branch = branch;
    }

    public final String getRevision() {
        return revision;
    }

    public final String getBranch() {
        return revision;
    }
}
