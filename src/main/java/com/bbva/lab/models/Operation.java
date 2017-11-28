package com.bbva.lab.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by Administrador on 28/11/2017.
 */

@Document(collection = "operaciones")
public class Operation {

    @Id
    @Field("_id")
    private String id;
    private long createdAt;
    @Field("data")
    private DataOperation data;
    private int offset;

    public Operation() {
    }

    public Operation(String id, long createdAt, DataOperation data, int offset) {
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

    public DataOperation getData() {
        return data;
    }

    public void setData(DataOperation data) {
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
        return "Operation{" +
                "id='" + id + '\'' +
                ", createdAt=" + createdAt +
                ", data=" + data +
                ", offset=" + offset +
                '}';
    }
}
