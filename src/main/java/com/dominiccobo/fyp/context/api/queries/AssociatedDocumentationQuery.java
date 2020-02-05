package com.dominiccobo.fyp.context.api.queries;

import com.dominiccobo.fyp.context.models.DocumentationType;
import com.dominiccobo.fyp.context.models.Pagination;
import com.dominiccobo.fyp.context.models.QueryContext;
import com.dominiccobo.fyp.context.models.TopicIdentifier;

import java.util.ArrayList;
import java.util.List;

public class AssociatedDocumentationQuery extends AbstractQueryForTopic {

    private static final TopicIdentifier TOPIC_IDENTIFIER = new TopicIdentifier("Documentation");
    private String searchTerm;
    private List<DocumentationType> documentationTypes = new ArrayList<>();

    private AssociatedDocumentationQuery(QueryContext context, Pagination pagination) {
        super(TOPIC_IDENTIFIER, context, pagination);
    }

    public static final class Builder {

        public static final String MUST_SPECIFY_DOC_TYPE_ERROR = "Must specify a documentation type.";
        public static final String MUST_SPECIFY_SEARCH_TERM_ERROR = "Must specify a search term";
        private AssociatedDocumentationQuery underConstruction;

        private Builder() {}

        public Builder(QueryContext queryContext, Pagination pagination) {
            underConstruction = new AssociatedDocumentationQuery(queryContext, pagination);
        }

        public Builder forSearchTerm(String term) {
            underConstruction.searchTerm = term;
            return this;
        }

        public Builder forDocumentationType(DocumentationType documentationType) {
            underConstruction.documentationTypes.add(documentationType);
            return this;
        }

        public final AssociatedDocumentationQuery build() throws IllegalStateException {
            if(underConstruction.getDocumentationTypes().size() <  1) {
                throw new IllegalStateException(MUST_SPECIFY_DOC_TYPE_ERROR);
            }
            if(underConstruction.getSearchTerm() == null || underConstruction.getSearchTerm().isEmpty()) {
                throw new IllegalStateException(MUST_SPECIFY_SEARCH_TERM_ERROR);
            }
            return this.underConstruction;
        }
    }

    public final String getSearchTerm() {
        return searchTerm;
    }

    public final List<DocumentationType> getDocumentationTypes() {
        return documentationTypes;
    }
}
