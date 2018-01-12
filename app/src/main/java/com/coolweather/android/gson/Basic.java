package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by john on 2018/1/12.
 */

//"basic":{
//        "city":"苏州", //-----------------------
//        "cnty":"中国",
//        "id":"CN101190401", //---------------------
//        "lat":"31.29937935",
//        "lon":"120.61958313",
//        "update":{ ////////////////////////////
//                  "loc":"2018-01-12 11:01", //--------------------------
//                  "utc":"2018-01-12 03:01"
//                  }
//        }

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
