package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by john on 2018/1/12.
 */

//JSON
//        HeWeather
//        0
//        aqi
//        basic
//        daily_forecast
//        now
//        status : "ok"
//        suggestion

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
