package com.example.web.dto;

import com.example.web.model.Weather;
import com.example.web.model.WeatherMain;

import java.util.List;

public class CurrentWeatherDto {
    private List<WeatherDto> weather;
    private String name;
    private WeatherMainDto main;
    private String symbol;
    public CurrentWeatherDto() {
    }



    public CurrentWeatherDto(List<WeatherDto> weather, String name, WeatherMainDto main, String symbol) {
        this.weather = weather;
        this.name = name;
        this.main = main;
        this.symbol = symbol;
    }

    public List<WeatherDto> getWeather() {
        return weather;
    }

    public String getName() {
        return name;
    }

    public WeatherMainDto getMain() {
        return main;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}