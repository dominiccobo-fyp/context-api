package com.dominiccobo.fyp.context.models.document;

/**
 * Represents any contextual information associated with a given open local document.
 */
public class DocumentContext {

    private final String documentUri;

    public DocumentContext(String documentUri) {
        this.documentUri = documentUri;
    }

    public final String getDocumentUri() {
        return documentUri;
    }
}
