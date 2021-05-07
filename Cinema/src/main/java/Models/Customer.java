package Models;

//Valeh


public class Customer {
    private int id;
    private String name;
    private String gender;
    private int ticket;
    private int seatNumber;
    private String products;

    private double hasPaid;
    private boolean isRegular;

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

    public int getTicket() {
        return ticket;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public double getHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(double hasPaid) {
        this.hasPaid = hasPaid;
    }

    public boolean isRegular() {
        return isRegular;
    }

    public Customer(int id, String name, String gender, int ticket, int seatNumber, String products, double hasPaid, boolean isRegular) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.ticket = ticket;
        this.seatNumber = seatNumber;
        this.products = products;
        this.hasPaid = hasPaid;
        this.isRegular = isRegular;
    }

    public void setRegular(boolean regular) {
        isRegular = regular;
    }


}
