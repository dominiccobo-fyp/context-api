package com.dominiccobo.fyp.context.models;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;
import java.util.List;

public class Expert {

    private String expertName;
    private List<ContactDetails> contactDetails = new ArrayList<>();
    private List<ExpertTopic> expertTopics = new ArrayList<>();

    public String getExpertName() {
        return expertName;
    }

    public List<ContactDetails> getContactDetails() {
        return contactDetails;
    }

    public List<ExpertTopic> getExpertTopics() {
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
}
