package com.example.web.model;

public class WeatherMain {
    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private int pressure;
    private int humidity;
    private int sea_level;
    private int grnd_level;

    public WeatherMain() {
    }

    public WeatherMain(double temp, double feels_like, double temp_min, double temp_max, int pressure, int humidity, int sea_level, int grnd_level) {
        this.temp = temp;
        this.feels_like = feels_like;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
        this.sea_level = sea_level;
        this.grnd_level = grnd_level;
    }

    public double getTemp() {
        return temp;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getSea_level() {
        return sea_level;
    }

    public int getGrnd_level() {
        return grnd_level;
    }

}
