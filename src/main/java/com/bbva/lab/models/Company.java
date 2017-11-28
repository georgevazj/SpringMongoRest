package com.bbva.lab.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by jorge on 22/12/2016.
 */

@Document(collection = "empresas")
public class Company {

    @Id
    private String id;
    private long createdAt;
    private DataCompany data;
    private Integer offset;

    public Company() {
    }


    public Company(String id, long createdAt, DataCompany data, Integer offset) {
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

    public DataCompany getData() {
        return data;
    }

    public void setData(DataCompany data) {
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
        return "Company{" +
                "id='" + id + '\'' +
                ", createdAt=" + createdAt +
                ", data=" + data +
                ", offset=" + offset +
                '}';
    }
}
