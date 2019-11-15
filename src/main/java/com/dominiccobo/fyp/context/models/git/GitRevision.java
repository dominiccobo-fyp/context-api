package com.dominiccobo.fyp.context.models.git;

public class GitRevision {
    private final String revision;
    private final String branch;

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
