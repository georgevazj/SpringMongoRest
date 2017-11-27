package com.bbva.lab.models;


/**
 * Created by Jorge on 27/11/17.
 */
public class Data {

    private Address address;
    private float balance;
    private String cellPhone;
    private String currency;
    private String date;
    private String name;
    private int pan;
    private String person;

    public Data() {
    }

    public Data(Address address, float balance, String cellPhone, String currency, String date, String name, int pan, String person) {
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

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
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
        return "Data{" +
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
