package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by john on 2018/1/12.
 */

//"daily_forecast": [ //------------------------
//        {
//              "astro": {
//                          "mr": "02:38",
//                          "ms": "13:46",
//                          "sr": "06:58",
//                          "ss": "17:15"
//                        },
//              "cond": { //---------------------------
//                           "code_d": "100",
//                           "code_n": "100",
//                           "txt_d": "晴", //---------------------
//                           "txt_n": "晴"
//                       },
//              "date": "2018-01-12", //--------------------
//              "hum": "26",
//              "pcpn": "0.0",
//              "pop": "0",
//              "pres": "1036",
//              "tmp": { //-------------------------------
//                          "max": "5", //----------------------
//                          "min": "-3" //-----------------------
//                      },
//              "uv": "3",
//              "vis": "20",
//              "wind": {
//                          "deg": "293",
//                          "dir": "西北风",
//                          "sc": "微风",
//                          "spd": "4"
//                      }
//        },
//        {
//        "astro": {
//        "mr": "03:32",
//        "ms": "14:25",
//        "sr": "06:58",
//        "ss": "17:16"
//        },
//        "cond": {
//        "code_d": "100",
//        "code_n": "101",
//        "txt_d": "晴",
//        "txt_n": "多云"
//        },
//        "date": "2018-01-13",
//        "hum": "32",
//        "pcpn": "0.0",
//        "pop": "0",
//        "pres": "1033",
//        "tmp": {
//        "max": "7",
//        "min": "-1"
//        },
//        "uv": "3",
//        "vis": "20",
//        "wind": {
//        "deg": "158",
//        "dir": "东南风",
//        "sc": "3-4",
//        "spd": "13"
//        }
//        },
//        {
//        "astro": {
//        "mr": "04:24",
//        "ms": "15:07",
//        "sr": "06:57",
//        "ss": "17:17"
//        },
//        "cond": {
//        "code_d": "101",
//        "code_n": "101",
//        "txt_d": "多云",
//        "txt_n": "多云"
//        },
//        "date": "2018-01-14",
//        "hum": "64",
//        "pcpn": "0.0",
//        "pop": "0",
//        "pres": "1027",
//        "tmp": {
//        "max": "11",
//        "min": "3"
//        },
//        "uv": "3",
//        "vis": "20",
//        "wind": {
//        "deg": "102",
//        "dir": "东南风",
//        "sc": "3-4",
//        "spd": "11"
//        }
//        }
//        ]

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

}
