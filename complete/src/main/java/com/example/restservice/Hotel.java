package com.example.restservice;

public class Hotel {

    private final long id;
    private final String name;

    public Hotel(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return name;
    }
}
