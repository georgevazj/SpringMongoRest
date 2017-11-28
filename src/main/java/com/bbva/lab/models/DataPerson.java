package com.bbva.lab.models;


import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Jorge on 27/11/17.
 */

@Document
public class DataPerson {

    private Address address;
    private double balance;
    private String cellPhone;
    private String currency;
    private String date;
    private String name;
    private int pan;
    private String person;

    public DataPerson() {
    }

    public DataPerson(Address address, double balance, String cellPhone, String currency, String date, String name, int pan, String person) {
        this.address = address;
        this.balance = balance;
        this.cellPhone = cellPhone;
        this.currency = currency;
        this.date = date;
        this.name = name;
        this.pan = pan;
        this.person = person;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPan() {
        return pan;
    }

    public void setPan(int pan) {
        this.pan = pan;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "DataPerson{" +
                "address=" + address +
                ", balance=" + balance +
                ", cellPhone='" + cellPhone + '\'' +
                ", currency='" + currency + '\'' +
                ", date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", pan=" + pan +
                ", person='" + person + '\'' +
                '}';
    }
}
