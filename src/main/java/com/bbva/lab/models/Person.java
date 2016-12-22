package com.bbva.lab.models;

import org.springframework.data.annotation.Id;

/**
 * Created by jorge on 22/12/2016.
 */
public class Person {

    @Id
    private String id;

    private String firstName;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
