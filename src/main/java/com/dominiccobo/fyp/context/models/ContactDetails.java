package com.dominiccobo.fyp.context.models;

import java.util.Objects;

public class ContactDetails {
    private String meansName;
    private String details;

    private ContactDetails() {}

    public ContactDetails(String meansName, String details) {
        this.meansName = meansName;
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        ContactDetails that = (ContactDetails) o;

        if (!Objects.equals(meansName, that.meansName)) return false;
        return Objects.equals(details, that.details);
    }

    @Override
    public int hashCode() {
        int result = meansName != null ? meansName.hashCode() : 0;
        result = 31 * result + (details != null ? details.hashCode() : 0);
        return result;
    }

    public final String getMeansName() {
        return meansName;
    }

    public final String getDetails() {
        return details;
    }
}
