package Models;

//Pervin
public class Address {
    private final String country;
    private final String region;
    private final String city;
    private final String addressLine;
    private final String postalCode;
    private final Location location;

    public Address(String country, String region, String city, String addressLine, String postalCode, Location location) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.addressLine = addressLine;
        this.postalCode = postalCode;
        this.location = location;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
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
