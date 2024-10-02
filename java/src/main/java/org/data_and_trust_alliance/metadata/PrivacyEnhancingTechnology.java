package org.data_and_trust_alliance.metadata;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class PrivacyEnhancingTechnology {

    private String uuid;
    private Concept tool;
    private String parameters;
    private String result;

    public PrivacyEnhancingTechnology(Concept tool, String parameters, String result) {
        this.uuid = UUID.randomUUID().toString(); // Generate UUID
        this.tool = tool;
        this.parameters = parameters;
        this.result = result;
    }

    public static PrivacyEnhancingTechnology defaultInstance() {
        return new PrivacyEnhancingTechnology(Concept.defaultConcept(), "", "");
    }

    public static class DefaultOption {
        private String code;
        private String description;

        public DefaultOption(String code, String description) {
            this.code = code;
            this.description = description;
        }

        // Getters
        public String getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }
    }

    public static final DefaultOption[] defaultOptions = {
            new DefaultOption("data-anonymization", "Data Anonymization"),
            new DefaultOption("data-encryption", "Data Encryption"),
            new DefaultOption("data-masking", "Data Masking"),
            new DefaultOption("data-minimization", "Data Minimization"),
            new DefaultOption("data-redaction", "Data Redaction"),
            new DefaultOption("differential-privacy", "Differential Privacy"),
            new DefaultOption("federated-learning", "Federated Learning"),
            new DefaultOption("homomorphic-encryption", "Homomorphic Encryption"),
            new DefaultOption("k-anonymity", "K-anonymity"),
            new DefaultOption("l-diversity", "L-diversity"),
            new DefaultOption("pseudonymization", "Pseudonymization"),
            new DefaultOption("secure-multi-party-computation", "Secure Multi-party Computation (SMC)"),
            new DefaultOption("t-closeness", "T-closeness"),
            new DefaultOption("tokenization", "Tokenization")
    };

    public static final String defaultSystem = "https://dataandtrustalliance.org/DPS/CodeSystem/PET";

    public static Set<String> getDescriptions() {
        Set<String> descriptions = new HashSet<>();
        for (DefaultOption option : defaultOptions) {
            descriptions.add(option.getDescription());
        }
        return descriptions;
    }

    // Getters and Setters
    public String getUuid() {
        return uuid;
    }

    public Concept getTool() {
        return tool;
    }

    public void setTool(Concept tool) {
        this.tool = tool;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
