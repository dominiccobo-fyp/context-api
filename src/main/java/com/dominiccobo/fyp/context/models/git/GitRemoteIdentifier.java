package com.dominiccobo.fyp.context.models.git;

/**
 * Describes the client's chosen identifier for an upstream. This is
 * commonly and conventionally "upstream" or "downstream".
 *
 * @author Dominic Cobo (contact@dominiccobo.com)
 */
public class GitRemoteIdentifier {
    private final String identifier;

    public GitRemoteIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }
}
