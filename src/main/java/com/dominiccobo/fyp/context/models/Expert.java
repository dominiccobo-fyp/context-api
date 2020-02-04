package com.dominiccobo.fyp.context.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class Expert {

    private String expertName;
    private List<ContactDetails> contactDetails = new ArrayList<>();
    private List<ExpertTopic> expertTopics = new ArrayList<>();

    public String getExpertName() {
        return expertName;
    }

    public final List<ContactDetails> getContactDetails() {
        return contactDetails;
    }

    public final List<ExpertTopic> getExpertTopics() {
        return expertTopics;
    }

    @JsonCreator
    private Expert() {}

    public static class Builder {
        private Expert underConstruction = new Expert();

        public Builder setExpertName(String expertName) {
            underConstruction.expertName = expertName;
            return this;
        }

        public Builder withContactDetails(ContactDetails contactDetails) {
            underConstruction.contactDetails.add(contactDetails);
            return this;
        }

        public Builder withExpertiseOn(ExpertTopic topic) {
            underConstruction.expertTopics.add(topic);
            return this;
        }

        public Expert build() {
            return underConstruction;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        Expert expert = (Expert) o;
        if(expert == null) return false;

        if (expertName != null && !expertName.equals(expert.expertName) || expertName == null && expert.expertName != null)
            return false;

        if(!CollectionUtils.containsAny(contactDetails, expert.getContactDetails())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = expertName != null ? expertName.hashCode() : 0;
        result = 31 * result + (contactDetails != null ? contactDetails.hashCode() : 0);
        result = 31 * result + (expertTopics != null ? expertTopics.hashCode() : 0);
        return result;
    }
}
