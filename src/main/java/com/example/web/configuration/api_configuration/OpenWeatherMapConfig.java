package com.example.web.configuration.api_configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenWeatherMapConfig {

//    @Value("${openweathermap.api.key}")
    private String apikey;

}
