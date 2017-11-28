package com.bbva.lab.models;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    private DataOperation dataOperation;
    private int offset;

    public Operation() {
    }

    public Operation(String id, long createdAt, DataOperation dataOperation, int offset) {
        this.id = id;
        this.createdAt = createdAt;
        this.dataOperation = dataOperation;
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

    public DataOperation getDataOperation() {
        return dataOperation;
    }

    public void setDataOperation(DataOperation dataOperation) {
        this.dataOperation = dataOperation;
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
                ", dataOperation=" + dataOperation +
                ", offset=" + offset +
                '}';
    }
}
