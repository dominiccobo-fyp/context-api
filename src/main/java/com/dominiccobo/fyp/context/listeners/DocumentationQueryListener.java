package com.dominiccobo.fyp.context.listeners;

import com.dominiccobo.fyp.context.api.queries.AssociatedDocumentationQuery;
import com.dominiccobo.fyp.context.models.Documentation;

import java.util.List;

public interface DocumentationQueryListener {
    List<Documentation> on(AssociatedDocumentationQuery query);
}
