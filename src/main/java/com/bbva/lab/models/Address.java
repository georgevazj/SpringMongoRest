package com.bbva.lab.models;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Jorge on 27/11/17.
 */

@Document
public class Address {

    private String full;
    private GeoLocation geolocation;
    private String zipCode;

    public Address() {
    }

    public Address(String full, GeoLocation geolocation, String zipCode) {
        this.full = full;
        this.geolocation = geolocation;
        this.zipCode = zipCode;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public GeoLocation getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(GeoLocation geolocation) {
        this.geolocation = geolocation;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "full='" + full + '\'' +
                ", geolocation=" + geolocation +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
