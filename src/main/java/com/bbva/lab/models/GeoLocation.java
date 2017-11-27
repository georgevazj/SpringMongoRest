package com.bbva.lab.models;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Jorge on 27/11/17.
 */

@Document
public class GeoLocation {

    private String latitude;
    private String longitude;

    public GeoLocation() {
    }

    public GeoLocation(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "GeoLocation{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}
