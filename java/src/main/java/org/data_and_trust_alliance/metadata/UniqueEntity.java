package org.data_and_trust_alliance.metadata;

import java.util.UUID;

public class UniqueEntity {

    private String uuid;

    public UniqueEntity() {
        this.uuid = UUID.randomUUID().toString();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
