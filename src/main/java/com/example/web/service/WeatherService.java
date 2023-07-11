package com.example.web.service;

import com.example.web.configuration.api_configuration.OpenWeatherMapConfig;
import com.example.web.dto.ActivityCurrentWeatherDto;
import com.example.web.dto.converter.ActivityCurrentWeatherDtoConverter;
import com.example.web.dto.converter.CurrentWeatherDtoConverter;
import com.example.web.model.CurrentWeather;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class WeatherService {
    private final RestTemplate restTemplate;
//    private final OpenWeatherMapConfig;

    private final ActivityCurrentWeatherDtoConverter activityCurrentWeatherDto;

    public WeatherService(RestTemplate restTemplate, ActivityCurrentWeatherDtoConverter activityCurrentWeatherDto) {
        this.restTemplate = restTemplate;
        this.activityCurrentWeatherDto = activityCurrentWeatherDto;
    }

    public ActivityCurrentWeatherDto getCurrentWeather(String city) {
        String apiKey = "9998948c5266c8f299a5f5fd6e669452";
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

        CurrentWeather currWeather = restTemplate.getForObject(apiUrl, CurrentWeather.class);
        currWeather.setSymbol(city);

        return activityCurrentWeatherDto.convert(currWeather);
    }


}
