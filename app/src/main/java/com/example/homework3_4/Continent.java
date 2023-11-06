package com.example.homework3_4;

import java.io.Serializable;

public class Continent implements Serializable {

    private String name;

    public Continent(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}