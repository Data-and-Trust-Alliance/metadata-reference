package org.data_and_trust_alliance.metadata;

import java.util.Arrays;
import java.util.List;

public class DataFormat extends UniqueEntity {

    private String value;

    public DataFormat(String value) {
        super();
        this.value = value;
    }

    public static DataFormat defaultFormat() {
        return new DataFormat("");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // Static list of default options
    public static final List<String> defaultOptions = Arrays.asList(
        "application/json",
        "application/jsonld",
        "application/zip",
        "application/msword",
        "application/vnd.ms-excel",
        "image/bmp",
        "image/jpeg",
        "image/x-png",
        "image/png",
        "image/gif",
        "text/csv",
        "text/plain"
    );
}
