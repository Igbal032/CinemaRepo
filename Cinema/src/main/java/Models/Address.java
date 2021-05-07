package org.example;

//Pervin
public class Address {
    private final String counry;
    private final String region;
    private final String city;
    private final String addressLine;
    private final Location location;

    public Address(String counry, String region, String city, String addressLine, Location location) {
        this.counry = counry;
        this.region = region;
        this.city = city;
        this.addressLine = addressLine;
        this.location = location;
    }

    public String getCounry() {
        return counry;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public Location getLocation() {
        return location;
    }
}
