package com.example.web.dto.converter;

import com.example.web.dto.WeatherMainDto;
import com.example.web.model.WeatherMain;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class WeatherMainDtoConverter {



    public WeatherMainDto convert(WeatherMain from) {
        double celsiusTemp = convertKelvinToCelsius(from.getTemp());
        double celsiusFeelsLike = convertKelvinToCelsius(from.getFeels_like());
        double celsiusTempMin = convertKelvinToCelsius(from.getTemp_min());
        double celsiusTempMax = convertKelvinToCelsius(from.getTemp_max());

        return new WeatherMainDto(
                celsiusTemp,
                celsiusFeelsLike,
                celsiusTempMin,
                celsiusTempMax,
                from.getPressure(),
                from.getHumidity(),
                from.getSea_level(),
                from.getGrnd_level()
        );
    }

    public double convertKelvinToCelsius(double kelvinTemp) {
        double celsiusTemp = kelvinTemp - 273.15;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(celsiusTemp));
    }
    public List<WeatherMainDto> convert(List<WeatherMain> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }
}
