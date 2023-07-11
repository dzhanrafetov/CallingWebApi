package com.example.web.model;

import java.util.List;

public class CurrentWeather {


    private List<Weather> weather;
    private String name;
    private WeatherMain main;
    public  String symbol;

    public CurrentWeather() {
    }

    public CurrentWeather(List<Weather> weather, String name, WeatherMain main) {
        this.weather = weather;
        this.name = name;
        this.main = main;
    }

    public CurrentWeather(List<Weather> weather, String name, WeatherMain main, String symbol) {
        this.weather = weather;
        this.name = name;
        this.main = main;
        this.symbol = symbol;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public String getName() {
        return name;
    }

    public WeatherMain getMain() {
        return main;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}

