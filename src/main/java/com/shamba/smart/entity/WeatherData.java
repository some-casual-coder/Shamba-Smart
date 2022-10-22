package com.shamba.smart.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WeatherData{
    private double wind_speed;
    private int humidity;
    private double temp;
    private double dew_point;
    private String rainfall;

    public WeatherData(double wind_speed, int humidity, double temp, double dew_point, String rainfall) {
        this.wind_speed = wind_speed;
        this.humidity = humidity;
        this.temp = temp+273.15;
        this.dew_point = dew_point;
        this.rainfall = rainfall;
    }
}
