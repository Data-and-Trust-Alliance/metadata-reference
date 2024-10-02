package org.data_and_trust_alliance.metadata;

import java.util.UUID;

public class UniqueConcept extends Concept {

    private String uuid;

    public UniqueConcept(String code, String system, String description) {
        super(code, system, description);
        this.uuid = UUID.randomUUID().toString();
    }

    // Default method
    public static UniqueConcept defaultConcept() {
        return new UniqueConcept("", "", "");
    }

    // Getter and Setter for uuid
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
