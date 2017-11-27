package com.bbva.lab.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by jorge on 22/12/2016.
 */

@Document(collection = "personas")
public class Person {

    @Id
    private String id;
    private long createdAt;
    private Data data;
    private Integer offset;

    public Person() {
    }


    public Person(String id, long createdAt, Data data, Integer offset) {
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

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", createdAt=" + createdAt +
                ", data=" + data +
                ", offset=" + offset +
                '}';
    }
}
