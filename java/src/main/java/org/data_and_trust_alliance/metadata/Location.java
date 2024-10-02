package org.data_and_trust_alliance.metadata;

import java.util.UUID;

public class Location {

    private String uuid;
    private String country;
    private String state;
    private boolean inclusion;

    public Location(String country, String state, boolean inclusion) {
        this.uuid = UUID.randomUUID().toString();
        this.country = country;
        this.state = state;
        this.inclusion = inclusion;
    }

    // Default method
    public static Location defaultLocation() {
        return new Location("", "", true);
    }

    // Getter and Setter methods
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isInclusion() {
        return inclusion;
    }

    public void setInclusion(boolean inclusion) {
        this.inclusion = inclusion;
    }
}
