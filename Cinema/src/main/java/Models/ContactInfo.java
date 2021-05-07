package org.example;

import java.util.ArrayList;

//Pervin
public class ContactInfo {
    private ArrayList<String> emails;
    private ArrayList<String> numbers;
    private ArrayList<String> socialNetworkAddresses;

    public ContactInfo(ArrayList<String> emails, ArrayList<String> numbers, ArrayList<String> socialNetworkAddresses) {
        this.emails = emails;
        this.numbers = numbers;
        this.socialNetworkAddresses = socialNetworkAddresses;
    }

    public ArrayList<String> getEmails() {
        return emails;
    }

    public void setEmails(ArrayList<String> emails) {
        this.emails = emails;
    }

    public ArrayList<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<String> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<String> getSocialNetworkAddresses() {
        return socialNetworkAddresses;
    }

    public void setSocialNetworkAddresses(ArrayList<String> socialNetworkAddresses) {
        this.socialNetworkAddresses = socialNetworkAddresses;
    }
}
