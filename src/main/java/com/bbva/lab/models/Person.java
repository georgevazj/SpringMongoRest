package com.bbva.lab.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by jorge on 22/12/2016.
 */

@Document(collection = "personas")
public class Person {

    @Id
    private String id;
    private String createdAt;
    private Data data;
    private int offset;

    public Person() {
    }

    public Person(String id, String createdAt, Data data, int offset) {
        this.id = id;
        this.createdAt = createdAt;
        this.data = data;
        this.offset = offset;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", data=" + data +
                ", offset=" + offset +
                '}';
    }
}
