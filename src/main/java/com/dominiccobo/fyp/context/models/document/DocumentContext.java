package com.dominiccobo.fyp.context.models.document;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Represents any contextual information associated with a given open local document.
 */
public class DocumentContext {

    private String documentUri;

    @JsonCreator
    private DocumentContext() {}

    public DocumentContext(String documentUri) {
        this.documentUri = documentUri;
    }

    public final String getDocumentUri() {
        return documentUri;
    }
}
