package org.data_and_trust_alliance.metadata;

import java.util.*;

public class Method extends UniqueConcept {

    private String methodCategory;
    private String specificUse;

    public Method(String code, String system, String description, String methodCategory, String specificUse) {
        super(code, system, description);
        this.methodCategory = methodCategory;
        this.specificUse = specificUse;
    }

    // Default method
    public static Method defaultMethod() {
        return new Method("", "", "", "", "");
    }

    // Default options
    public static final List<Map<String, String>> defaultOptions = Arrays.asList(
        createOption("web-scraping-crawling-textual", "Web scraping/Crawling", "Textual"),
        createOption("web-scraping-crawling-structured", "Web scraping/Crawling", "Structured"),
        createOption("web-scraping-crawling-metadata", "Web scraping/Crawling", "Metadata"),
        createOption("web-scraping-crawling-social-media", "Web scraping/Crawling", "Social media"),
        createOption("web-scraping-crawling-news-articles", "Web scraping/Crawling", "News & articles"),
        createOption("web-scraping-crawling-other", "Web scraping/Crawling", "Other"),
        createOption("feeds-rss-source", "Feeds", "RSS source"),
        createOption("feeds-api-source", "Feeds", "API source"),
        createOption("feeds-real-time-database-info", "Feeds", "Real time database info"),
        createOption("feeds-interval-timed-database-info", "Feeds", "Interval timed database info"),
        createOption("feeds-file-feed-info", "Feeds", "File feed info"),
        createOption("feeds-other", "Feeds", "Other"),
        createOption("syndication-news-feeds", "Syndication", "News feeds"),
        createOption("syndication-financial-feeds", "Syndication", "Financial feeds"),
        createOption("syndication-social-media", "Syndication", "Social media"),
        createOption("syndication-product-service-catalog", "Syndication", "Product/service catalog"),
        createOption("syndication-other", "Syndication", "Other"),
        createOption("data-mining-association-rule", "Data mining", "Association rule"),
        createOption("data-mining-classification", "Data mining", "Classification"),
        createOption("data-mining-clustering", "Data mining", "Clustering"),
        createOption("data-mining-regression", "Data mining", "Regression"),
        createOption("data-mining-anomaly-detection", "Data mining", "Anomaly detection"),
        createOption("data-mining-sequencing", "Data mining", "Sequencing"),
        createOption("data-mining-other", "Data mining", "Other"),
        createOption("machine-generated-mlops-synthetic", "Machine generated/MLOps", "Synthetic"),
        createOption("machine-generated-mlops-generative", "Machine generated/MLOps", "Generative"),
        createOption("machine-generated-mlops-twin", "Machine generated/MLOps", "Twin"),
        createOption("machine-generated-mlops-machine-2-machine", "Machine generated/MLOps", "Machine-2-machine (M2M)"),
        createOption("machine-generated-mlops-ai-inferred", "Machine generated/MLOps", "AI inferred"),
        createOption("machine-generated-mlops-xr", "Machine generated/MLOps", "XR (AR, VR, MR)"),
        createOption("machine-generated-mlops-other", "Machine generated/MLOps", "Other"),
        createOption("sensor-and-iot-output-environmental", "Sensor and IoT output", "Environmental"),
        createOption("sensor-and-iot-output-motion-location", "Sensor and IoT output", "Motion & location"),
        createOption("sensor-and-iot-output-health", "Sensor and IoT output", "Health"),
        createOption("sensor-and-iot-output-biometric", "Sensor and IoT output", "Biometric"),
        createOption("sensor-and-iot-output-energy-consumption", "Sensor and IoT output", "Energy consumption"),
        createOption("sensor-and-iot-output-industrial-sensor", "Sensor and IoT output", "Industrial sensor"),
        createOption("sensor-and-iot-output-vehicle-transportation", "Sensor and IoT output", "Vehicle & transportation"),
        createOption("sensor-and-iot-output-security-surveillance", "Sensor and IoT output", "Security & surveillance"),
        createOption("sensor-and-iot-output-agriculture-environment", "Sensor and IoT output", "Agriculture & environment"),
        createOption("sensor-and-iot-output-other", "Sensor and IoT output", "Other"),
        createOption("social-media-text-based", "Social media", "Text based"),
        createOption("social-media-multimedia", "Social media", "Multimedia"),
        createOption("social-media-reviews-and-ratings", "Social media", "Reviews and ratings"),
        createOption("social-media-updates", "Social media", "Updates"),
        createOption("social-media-q-and-a", "Social media", "Q&As"),
        createOption("social-media-collaborative", "Social media", "Collaborative"),
        createOption("social-media-creative", "Social media", "Creative"),
        createOption("social-media-other", "Social media", "Other"),
        createOption("user-generated-content-clickstream", "User generated content", "Clickstream"),
        createOption("user-generated-content-social-media", "User generated content", "Social media"),
        createOption("user-generated-content-behavior", "User generated content", "Behavior"),
        createOption("user-generated-content-ratings-and-reviews", "User generated content", "Ratings & reviews"),
        createOption("user-generated-content-multimedia", "User generated content", "Multimedia"),
        createOption("user-generated-content-other", "User generated content", "Other"),
        createOption("primary-user-source-survey-questionnaire", "Primary user source", "Survey/Questionnaire"),
        createOption("primary-user-source-interview", "Primary user source", "Interview"),
        createOption("primary-user-source-event", "Primary user source", "Event"),
        createOption("primary-user-source-biometric", "Primary user source", "Biometric"),
        createOption("primary-user-source-focus-group", "Primary user source", "Focus Group"),
        createOption("primary-user-source-other", "Primary user source", "Other"),
        createOption("data-augmentation-na", "Data augmentation", "N/A"),
        createOption("transfer-learning-na", "Transfer learning", "N/A"),
        createOption("simulations-na", "Simulations", "N/A"),
        createOption("other-na", "Other", "N/A")
    );

    // Helper method to create options
    private static Map<String, String> createOption(String code, String categoryText, String specificUseText) {
        Map<String, String> option = new HashMap<>();
        option.put("code", code);
        option.put("categoryText", categoryText);
        option.put("specificUseText", specificUseText);
        return option;
    }

    public static final String defaultSystem = "https://dataandtrustalliance.org/DPS/CodeSystem/Method";

    public static String getDefaultDescription(String categoryText, String specificUseText) {
        return categoryText + " " + specificUseText;
    }

    public static Set<String> getMethodCategories() {
        Set<String> categories = new HashSet<>();
        for (Map<String, String> option : defaultOptions) {
            categories.add(option.get("categoryText"));
        }
        return categories;
    }

    public static List<String> getSpecificUses(String categoryText) {
        List<String> specificUses = new ArrayList<>();
        specificUses.add("");
        for (Map<String, String> option : defaultOptions) {
            if (option.get("categoryText").equals(categoryText)) {
                specificUses.add(option.get("specificUseText"));
            }
        }
        return specificUses;
    }

    // Getters and Setters
    public String getMethodCategory() {
        return methodCategory;
    }

    public void setMethodCategory(String methodCategory) {
        this.methodCategory = methodCategory;
    }

    public String getSpecificUse() {
        return specificUse;
    }

    public void setSpecificUse(String specificUse) {
        this.specificUse = specificUse;
    }
}
