package org.data_and_trust_alliance.metadata;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ConfidentialityClassification extends UniqueConcept {

    private boolean enabled;

    public ConfidentialityClassification(String code, String system, String description, boolean enabled) {
        super(code, system, description);
        this.enabled = enabled;
    }

    // Default method
    public static ConfidentialityClassification defaultClassification() {
        return new ConfidentialityClassification("", "", "", true);
    }

    // Method for data provenance standards entry
    public static ConfidentialityClassification dataProvenanceStandardsEntry(String code, String description) {
        return new ConfidentialityClassification(code, ConfidentialityClassification.defaultSystem, description, false);
    }

    // Getter and Setter methods
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    // Static list of default options
    public static final List<Map<String, String>> defaultOptions = Arrays.asList(
        Map.of("code", "pi", "description", "Personal Information (PI)/Demographic"),
        Map.of("code", "pci", "description", "Payment Card Industry (PCI)"),
        Map.of("code", "pfi", "description", "Personal Financial Information (PFI)"),
        Map.of("code", "pii", "description", "Personally Identifiable Information (PII)"),
        Map.of("code", "phi", "description", "Personal Health Information (PHI)"),
        Map.of("code", "spi", "description", "Sensitive Personal Information (SPI)")
    );

    // Default system
    public static final String defaultSystem = "https://dataandtrustalliance.org/DPS/CodeSystem/Regulations";
}
