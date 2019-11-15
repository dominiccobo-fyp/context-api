package com.dominiccobo.fyp.context.models;

import com.dominiccobo.fyp.context.models.document.DocumentContext;
import com.dominiccobo.fyp.context.models.git.GitContext;

import java.util.Optional;

/**
 * Defines contextual-resolved content sent by the client on which a query can act on to provide
 * information on a given topic.
 */
public class QueryContext {
    private final GitContext gitContext;
    private final DocumentContext documentContext;

    public QueryContext(GitContext gitContext, DocumentContext documentContext) {
        this.gitContext = gitContext;
        this.documentContext = documentContext;
    }

    public Optional<GitContext> getGitContext() {
        return Optional.ofNullable(gitContext);
    }

    public Optional<DocumentContext> getDocumentContext() {
        return Optional.ofNullable(documentContext);
    }
}
