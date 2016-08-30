package com.heroku.undertow;

import java.io.Serializable;


public class BigOperation implements Serializable {

    private String name;

    public BigOperation() {
    }

    public BigOperation(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BigOperation{" +
                "name='" + name + '\'' +
                '}';
    }
}
