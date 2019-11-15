package com.dominiccobo.fyp.context.models.git;

import java.util.Map;
import java.util.Optional;

/**
 * Describes the resolved Git client / protocol information provided by the querying client.
 *
 * @author Dominic Cobo (contact@dominiccobo.com)
 */
public class GitContext {

    private final Map<GitRemoteIdentifier, GitRemoteURL> remotes;
    private final GitRevision currentRevision;

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
