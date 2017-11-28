package com.bbva.lab.models;


import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Jorge on 27/11/17.
 */

@Document
public class DataCompany {

    private Address address;
    private double balance;
    private String currency;
    private String date;
    private String name;
    private String company;

    public DataCompany() {
    }

    public DataCompany(Address address, double balance, String currency, String date, String name, String company) {
        this.address = address;
        this.balance = balance;
        this.currency = currency;
        this.date = date;
        this.name = name;
        this.company = company;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "DataCompany{" +
                "address=" + address +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
