package org.data_and_trust_alliance.metadata;

public class Concept {

    private String code;
    private String system;
    private String description;

    public Concept(String code, String system, String description) {
        this.code = code;
        this.system = system;
        this.description = description;
    }

    // Default constructor that returns an empty concept.
    public static Concept defaultConcept() {
        return new Concept("", "", "");
    }

    // Method to generate code by replacing non-alphanumeric characters with hyphens
    public static String generateCode(String value) {
        String delimiter = "-";
        
        // Replace all non-alphanumeric characters with hyphens using regex
        String tempValue = value.replaceAll("[^a-zA-Z0-9]+", delimiter);

        // Convert to lower case
        tempValue = tempValue.toLowerCase();

        // Remove leading/trailing hyphens
        tempValue = tempValue.replaceAll("^-+", "").replaceAll("-+$", "");

        return tempValue;
    }

    // Getter and Setter methods
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
