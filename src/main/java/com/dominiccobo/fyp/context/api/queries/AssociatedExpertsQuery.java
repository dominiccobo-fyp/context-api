package com.dominiccobo.fyp.context.api.queries;

import com.dominiccobo.fyp.context.models.Pagination;
import com.dominiccobo.fyp.context.models.QueryContext;
import com.dominiccobo.fyp.context.models.TopicIdentifier;

public class AssociatedExpertsQuery extends AbstractQueryForTopic {
    private static final TopicIdentifier TOPIC_IDENTIFIER = new TopicIdentifier("Experts");

    public AssociatedExpertsQuery(QueryContext context, Pagination pagination) {
        super(TOPIC_IDENTIFIER, context, pagination);
    }
}
