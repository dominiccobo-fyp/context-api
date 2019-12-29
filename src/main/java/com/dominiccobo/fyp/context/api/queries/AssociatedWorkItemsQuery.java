package com.dominiccobo.fyp.context.api.queries;

import com.dominiccobo.fyp.context.models.Pagination;
import com.dominiccobo.fyp.context.models.QueryContext;
import com.dominiccobo.fyp.context.models.TopicIdentifier;

/**
 * Query for requesting work items, (Change, Request, Feature, Release tickets etc) from other contexts.
 *
 * @author Dominic Cobo (contact@dominiccobo.com)
 */
public class AssociatedWorkItemsQuery extends AbstractQueryForTopic {

    private static final TopicIdentifier TOPIC_NAME = new TopicIdentifier("WorkItems");

    public AssociatedWorkItemsQuery(QueryContext information, Pagination pagination) {
        super(TOPIC_NAME, information, pagination);
    }
}
