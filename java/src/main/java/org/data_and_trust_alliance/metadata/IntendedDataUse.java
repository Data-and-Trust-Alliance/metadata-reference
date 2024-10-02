package org.data_and_trust_alliance.metadata;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class IntendedDataUse extends UniqueConcept {

    private String descriptionDisplayText;
    private boolean enabled;

    public IntendedDataUse(String code, String system, String description, String descriptionDisplayText, boolean enabled) {
        super(code, system, description);
        this.descriptionDisplayText = descriptionDisplayText;
        this.enabled = enabled;
    }

    // Default method
    public static IntendedDataUse defaultIntendedDataUse() {
        return new IntendedDataUse("", "", "", "", true);
    }

    // Data provenance standards entry method
    public static IntendedDataUse dataProvenanceStandardsEntry(String code, String description, String descriptionDisplayText) {
        return new IntendedDataUse(code, defaultSystem, description, descriptionDisplayText, false);
    }

    // Custom Non-AI entry method
    public static IntendedDataUse customNonAiEntry() {
        return new IntendedDataUse("non-ai-other", "", "", "", true);
    }

    // Custom AI entry method
    public static IntendedDataUse customAiEntry() {
        return new IntendedDataUse("ai-other", "", "", "", true);
    }

    // Getter and Setter methods
    public String getDescriptionDisplayText() {
        return descriptionDisplayText;
    }

    public void setDescriptionDisplayText(String descriptionDisplayText) {
        this.descriptionDisplayText = descriptionDisplayText;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    // Static list of default Non-AI options
    public static final List<Map<String, String>> defaultNonAiOptions = Arrays.asList(
        Map.of("code", "non-ai-staging", "description", "Non-AI Staging/testing", "descriptionText", "Staging/testing"),
        Map.of("code", "non-ai-production", "description", "Non-AI Production", "descriptionText", "Production"),
        Map.of("code", "non-ai-quality", "description", "Non-AI Quality assurance", "descriptionText", "Quality assurance")
    );

    // Static list of default AI options
    public static final List<Map<String, String>> defaultAiOptions = Arrays.asList(
        Map.of("code", "ai-pre-training", "description", "AI Pre-Training", "descriptionText", "Pre-Training"),
        Map.of("code", "ai-alignment", "description", "AI Alignment", "descriptionText", "Alignment"),
        Map.of("code", "ai-evaluation", "description", "AI Evaluation", "descriptionText", "Evaluation"),
        Map.of("code", "ai-synthetic", "description", "AI Synthetic Data Generation", "descriptionText", "Synthetic Data Generation")
    );

    // Default system
    public static final String defaultSystem = "https://dataandtrustalliance.org/DPS/CodeSystem/Use";
}
