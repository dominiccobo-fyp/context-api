package com.dominiccobo.fyp.context.models;

/**
 * Describes a basic pagination query filter, allowing retrieval of
 * results in collections.
 *
 * @author Dominic Cobo (contact@dominiccobo.com)
 */
public class Pagination {

    public final int page;
    public final int itemsPerPage;

    public Pagination(int page, int itemsPerPage) {
        this.page = page;
        this.itemsPerPage = itemsPerPage;
    }
}
