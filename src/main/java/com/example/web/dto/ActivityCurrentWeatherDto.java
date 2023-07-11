package com.example.web.dto;

import java.util.List;

public class ActivityCurrentWeatherDto {
    private List<ActivityDto> suggestedActivities;

    private List<WeatherDto> weather;
    private String name;
    private WeatherMainDto main;

    public ActivityCurrentWeatherDto() {
    }

    public ActivityCurrentWeatherDto(List<ActivityDto> suggestedActivities, List<WeatherDto> weather, String name, WeatherMainDto main) {
        this.suggestedActivities = suggestedActivities;
        this.weather = weather;
        this.name = name;
        this.main = main;
    }

    public ActivityCurrentWeatherDto(List<WeatherDto> weather, String name, WeatherMainDto main) {

            this.weather = weather;
            this.name = name;
            this.main = main;
    }


    public List<ActivityDto> getSuggestedActivities() {
        return suggestedActivities;
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

}
