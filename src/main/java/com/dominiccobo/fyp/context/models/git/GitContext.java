package com.dominiccobo.fyp.context.models.git;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Map;
import java.util.Optional;

/**
 * Describes the resolved Git client / protocol information provided by the querying client.
 *
 * @author Dominic Cobo (contact@dominiccobo.com)
 */
public class GitContext {

    private Map<GitRemoteIdentifier, GitRemoteURL> remotes;
    private GitRevision currentRevision;
    @JsonCreator
    private GitContext() {}

    public GitContext(Map<GitRemoteIdentifier, GitRemoteURL> remotes, GitRevision currentRevision) {
        this.remotes = remotes;
        this.currentRevision = currentRevision;
    }

    public Optional<Map<GitRemoteIdentifier, GitRemoteURL>> getRemotes() {
        return Optional.ofNullable(remotes);
    }

    public Optional<GitRevision> getCurrentRevision() {
        return Optional.ofNullable(currentRevision);
    }

}
