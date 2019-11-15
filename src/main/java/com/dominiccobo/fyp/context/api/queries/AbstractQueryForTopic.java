package com.dominiccobo.fyp.context.api.queries;

import com.dominiccobo.fyp.context.models.QueryContext;
import com.dominiccobo.fyp.context.models.TopicIdentifier;

/**
 * Represents a generic model of what a query, for a particular topic that has been mined, should provide or use.
 * All new {@link TopicIdentifier}s should extend their own version of this.
 *
 * @author Dominic Cobo (contact@dominiccobo.com)
 */
public abstract class AbstractQueryForTopic {
    private final TopicIdentifier topicToQueryFor;
    private final QueryContext context;

    public AbstractQueryForTopic(TopicIdentifier topicToQueryFor, QueryContext context) {
        this.topicToQueryFor = topicToQueryFor;
        this.context = context;
    }

    public final TopicIdentifier getTopicToQueryFor() {
        return topicToQueryFor;
    }

    public final QueryContext getContext() {
        return context;
    }
}
