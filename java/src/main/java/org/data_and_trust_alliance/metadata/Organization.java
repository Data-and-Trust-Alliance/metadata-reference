package org.data_and_trust_alliance.metadata;

import java.util.ArrayList;
import java.util.List;

public class Organization extends UniqueEntity {

    private String name;
    private List<AddressLine> addressLines;

    public Organization() {
        super();
        this.name = "";
        this.addressLines = new ArrayList<>();
    }

    public static Organization copy(Organization otherOrganization) {
        Organization duplicate = new Organization();
        duplicate.name = otherOrganization.name;
        
        // Copy each address line using the copy method from AddressLine class
        for (AddressLine addressLine : otherOrganization.addressLines) {
            duplicate.addressLines.add(AddressLine.copy(addressLine));
        }
        
        return duplicate;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AddressLine> getAddressLines() {
        return addressLines;
    }

    public void setAddressLines(List<AddressLine> addressLines) {
        this.addressLines = addressLines;
    }
}
