package com.example.web.controller;

import com.example.web.dto.ActivityCurrentWeatherDto;
import com.example.web.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/weather")
public class CurrentWeatherController {

    private final WeatherService weatherService;

    public CurrentWeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/currentWeather/{city}")
    public ResponseEntity<ActivityCurrentWeatherDto> getCurrentWeather(@PathVariable String city){
        return ResponseEntity.ok(weatherService.getCurrentWeather(city));
    }
}

