package com.dominiccobo.fyp.context.models.git;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Describes the client's chosen identifier for an upstream. This is
 * commonly and conventionally "upstream" or "downstream".
 *
 * @author Dominic Cobo (contact@dominiccobo.com)
 */
public class GitRemoteIdentifier {
    private String identifier;

    @JsonCreator
    private GitRemoteIdentifier() {}

    public GitRemoteIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }
}
