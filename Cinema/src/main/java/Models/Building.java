package Models;

//Pervin
public class Building {
    private String name;
    private final Address address;
    private final double space;
    private ContactInfo contactInfo;

    public Building(String name, Address address, double space, ContactInfo contactInfo) {
        this.name = name;
        this.address = address;
        this.space = space;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public double getSpace() {
        return space;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
}
