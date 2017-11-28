package com.bbva.lab.models;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by Jorge on 27/11/17.
 */

@Document
public class DataOperation {

    private double amount;
    private String company;
    private String currency;
    private String date;
    private String details;
    @Field("geolocation")
    private GeoLocation geoLocation;
    private String pan;

    public DataOperation() {
    }

    public DataOperation(double amount, String company, String currency, String date, String details, GeoLocation geoLocation, String pan) {
        this.amount = amount;
        this.company = company;
        this.currency = currency;
        this.date = date;
        this.details = details;
        this.geoLocation = geoLocation;
        this.pan = pan;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    @Override
    public String toString() {
        return "DataOperation{" +
                "amount=" + amount +
                ", company='" + company + '\'' +
                ", currency='" + currency + '\'' +
                ", date='" + date + '\'' +
                ", details='" + details + '\'' +
                ", geoLocation=" + geoLocation +
                ", pan='" + pan + '\'' +
                '}';
    }
}
