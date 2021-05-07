package Models;

//Valeh


import java.util.Collection;

public class Customer {
    private int id;
    private String name;
    private String surName;
    private String gender;
    private ContactInfo contactInfo;
    private Collection<Ticket> tickets;
    private Collection<Product> products;
    private double serviceAmount;
    private boolean isRegular;

    public Customer(int id, String name, String surName, String gender, ContactInfo contactInfo, Collection<Ticket> tickets, Collection<Product> products, double serviceAmount, boolean isRegular) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.contactInfo = contactInfo;
        this.tickets = tickets;
        this.products = products;
        this.serviceAmount = serviceAmount;
        this.isRegular = isRegular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }

    public double getServiceAmount() {
        return serviceAmount;
    }

    public void setServiceAmount(double serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    public boolean isRegular() {
        return isRegular;
    }

    public void setRegular(boolean regular) {
        isRegular = regular;
    }
}
