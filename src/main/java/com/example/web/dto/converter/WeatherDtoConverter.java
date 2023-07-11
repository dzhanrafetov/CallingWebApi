package com.example.web.dto.converter;

import com.example.web.dto.WeatherDto;
import com.example.web.model.Weather;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class WeatherDtoConverter {
    public WeatherDto convert(Weather from){
        return new WeatherDto(from.getMain(),from.getDescription());
    }

    public List<WeatherDto> convert(List<Weather> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }
}
