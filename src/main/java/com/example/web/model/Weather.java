package com.example.web.model;

public class Weather {
    private int id;
    private String main;
    private String description;

    public Weather() {
    }

    public Weather(int id, String main, String description) {
        this.id = id;
        this.main = main;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }
}
