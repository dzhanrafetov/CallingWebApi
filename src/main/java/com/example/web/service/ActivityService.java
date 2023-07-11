package com.example.web.service;

import com.example.web.dto.ActivityDto;
import com.example.web.dto.converter.WeatherMainDtoConverter;
import com.example.web.model.CurrentWeather;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityService {
    private final WeatherMainDtoConverter weatherMainDtoConverter;

    public ActivityService(WeatherMainDtoConverter weatherMainDtoConverter) {
        this.weatherMainDtoConverter = weatherMainDtoConverter;
    }

    public List<ActivityDto> suggestActivities(CurrentWeather currentWeather) {
        List<ActivityDto> suggestedActivities = new ArrayList<>();
        String weatherCondition = currentWeather.getWeather().get(0).getMain();

        double temperature =  weatherMainDtoConverter.convertKelvinToCelsius
                (currentWeather.getMain().getTemp());

        if (weatherCondition.equalsIgnoreCase("Clear")) {
            if (temperature > 25) {
                suggestedActivities.add(new ActivityDto("Swimming"));
            } else if (temperature < 15) {
                suggestedActivities.add(new ActivityDto("Gym"));
            }
        } else if (weatherCondition.equalsIgnoreCase("Clouds")) {
            if (temperature > 20) {
                suggestedActivities.add(new ActivityDto("Hiking"));
                suggestedActivities.add(new ActivityDto("Outdoor Walking"));

            } else {
                suggestedActivities.add(new ActivityDto("Indoor activities"));
            }
        }

        return suggestedActivities;
    }
}