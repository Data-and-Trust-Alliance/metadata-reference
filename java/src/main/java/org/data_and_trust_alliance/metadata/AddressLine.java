package org.data_and_trust_alliance.metadata;

public class AddressLine extends UniqueEntity {

    private String address;

    public AddressLine() {
        super();
        this.address = "";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static AddressLine copy(AddressLine otherAddressLine) {
        AddressLine duplicate = new AddressLine();
        duplicate.setAddress(otherAddressLine.getAddress());
        return duplicate;
    }
}
