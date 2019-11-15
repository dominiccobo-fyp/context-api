package com.dominiccobo.fyp.context.listeners;

import com.dominiccobo.fyp.context.api.queries.AssociatedWorkItemsQuery;
import com.dominiccobo.fyp.context.models.TopicQueryResult;
import com.dominiccobo.fyp.context.models.WorkItem;

import java.util.Collection;

/**
 * Generic listener for making it clearer and simpler for classes wanting to act on
 * {@link AssociatedWorkItemsQuery}.
 *
 * @author Dominic Cobo (contact@dominiccobo.com)
 */
public interface WorkItemQueryListener {

    TopicQueryResult<Collection<WorkItem>> on(AssociatedWorkItemsQuery query);
}
