package com.example.web.dto.converter;

import com.example.web.dto.CurrentWeatherDto;
import com.example.web.model.CurrentWeather;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CurrentWeatherDtoConverter {
    private final WeatherDtoConverter weatherDtoConverter;
    private final WeatherMainDtoConverter weatherMainDtoConverter;

    public CurrentWeatherDtoConverter(WeatherDtoConverter weatherDtoConverter, WeatherMainDtoConverter weatherMainDtoConverter) {
        this.weatherDtoConverter = weatherDtoConverter;
        this.weatherMainDtoConverter = weatherMainDtoConverter;
    }

    public CurrentWeatherDto convert(CurrentWeather from){
        return new CurrentWeatherDto(

                weatherDtoConverter.convert(new ArrayList<>
                        (from.getWeather())),

                from.getName(),
                weatherMainDtoConverter.convert(from.getMain()),
                from.symbol);

    }
}
