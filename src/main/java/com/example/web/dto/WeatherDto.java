package com.example.web.dto;

public class WeatherDto {

    private String main;
    private String description;

    public WeatherDto() {
    }

    public WeatherDto( String main, String description) {
        this.main = main;
        this.description = description;
    }


    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

}
