package com.dominiccobo.fyp.context.api.events;

import com.dominiccobo.fyp.context.models.git.GitRemoteURL;

/**
 * Denotes that an end client has recognised new remote urls, sharing them so that mining sources can prepare for any
 * potential queries they may receive.
 *
 * @author Dominic Cobo (contact@dominiccobo.com)
 */
public class GitRemoteURLRecognisedEvent {

    private final GitRemoteURL gitRemoteURL;

    public GitRemoteURLRecognisedEvent(GitRemoteURL gitRemoteURL) {
        this.gitRemoteURL = gitRemoteURL;
    }

    public GitRemoteURL getGitRemoteURL() {
        return gitRemoteURL;
    }
}
