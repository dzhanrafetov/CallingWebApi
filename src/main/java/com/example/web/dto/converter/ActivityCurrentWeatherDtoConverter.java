package com.example.web.dto.converter;

import com.example.web.dto.ActivityCurrentWeatherDto;
import com.example.web.dto.ActivityDto;
import com.example.web.dto.WeatherDto;
import com.example.web.dto.WeatherMainDto;
import com.example.web.model.CurrentWeather;
import com.example.web.service.ActivityService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ActivityCurrentWeatherDtoConverter {
    private final ActivityService activityService;
    private final WeatherDtoConverter weatherDtoConverter;
    private final WeatherMainDtoConverter weatherMainDtoConverter;

    public ActivityCurrentWeatherDtoConverter(ActivityService activityService, WeatherDtoConverter weatherDtoConverter, WeatherMainDtoConverter weatherMainDtoConverter) {
        this.activityService = activityService;
        this.weatherDtoConverter = weatherDtoConverter;
        this.weatherMainDtoConverter = weatherMainDtoConverter;
    }

    public ActivityCurrentWeatherDto convert(CurrentWeather currentWeather) {
        List<ActivityDto> suggestedActivities = activityService.suggestActivities(currentWeather);

        List<WeatherDto> weatherDtoList = currentWeather.getWeather().stream()
                .map(weatherDtoConverter::convert)
                .collect(Collectors.toList());

        WeatherMainDto weatherMainDto = weatherMainDtoConverter.convert(currentWeather.getMain());

        return new ActivityCurrentWeatherDto(suggestedActivities, weatherDtoList, currentWeather.getName(), weatherMainDto);
    }
}
