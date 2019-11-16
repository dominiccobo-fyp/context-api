package com.dominiccobo.fyp.context.listeners;

import com.dominiccobo.fyp.context.api.queries.AssociatedWorkItemsQuery;
import com.dominiccobo.fyp.context.models.WorkItem;

import java.util.List;

/**
 * Generic listener for making it clearer and simpler for classes wanting to act on
 * {@link AssociatedWorkItemsQuery}.
 *
 * @author Dominic Cobo (contact@dominiccobo.com)
 */
public interface WorkItemQueryListener {

    List<WorkItem> on(AssociatedWorkItemsQuery query);
}
