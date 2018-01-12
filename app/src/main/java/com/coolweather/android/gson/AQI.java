package com.coolweather.android.gson;

/**
 * Created by john on 2018/1/12.
 */

//"aqi": {
//        "city": {  //------------
//                  "aqi": "52",  //------------
//                  "qlty": "良",
//                  "pm25": "28", //------------------
//                  "pm10": "54",
//                  "no2": "51",
//                  "so2": "22",
//                  "co": "1",
//                  "o3": "29"
//                }
//        }

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }

}
