package Models;

import java.util.Collection;
import java.util.Date;

//Pervin
public class Building {
    private String name;
    private final Address address;
    private final double space;
    private double income;
    private Date openTime;
    private Date closeTime;
    private Collection<Employee> employees;
    private ContactInfo contactInfo;
    private Collection<Session> sessions;

    public Building(String name, Address address, double space, ContactInfo contactInfo, Collection<Session> sessions) {
        this.name = name;
        this.address = address;
        this.space = space;
        this.contactInfo = contactInfo;
        this.sessions = sessions;
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

    public Collection<Session> getSessions() {
        return sessions;
    }

    public void setSessions(Collection<Session> sessions) {
        this.sessions = sessions;
    }
}
