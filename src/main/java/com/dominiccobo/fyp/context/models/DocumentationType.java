package com.dominiccobo.fyp.context.models;

import java.util.Objects;

public class DocumentationType {

    public static final DocumentationType QA = new DocumentationType("QA");
    public static final DocumentationType WIKI = new DocumentationType("Wiki");

    private String typeName;

    private DocumentationType() {}

    public DocumentationType(String typeName) {
        this.typeName = typeName;
    }

    public final String getTypeName() {
        return typeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentationType that = (DocumentationType) o;
        return typeName.equals(that.typeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeName);
    }
}
