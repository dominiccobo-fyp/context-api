package com.dominiccobo.fyp.context.listeners;

import com.dominiccobo.fyp.context.api.queries.AssociatedExpertsQuery;
import com.dominiccobo.fyp.context.models.Expert;

import java.util.List;

public interface ExpertsQueryListener {

    List<Expert> on(AssociatedExpertsQuery query);
}
