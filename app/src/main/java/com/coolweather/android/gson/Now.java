package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by john on 2018/1/12.
 */

//"now": {
//        "cond": { //--------------------
//                  "code": "100",
//                  "txt": "晴" //-----------------
//                  },
//        "fl": "-8",
//        "hum": "24",
//        "pcpn": "0.0",
//        "pres": "1037",
//        "tmp": "0", //----------------
//        "vis": "7",
//        "wind": {
//                  "deg": "357",
//                  "dir": "北风",
//                  "sc": "微风",
//                  "spd": "8"
//                  }
//        }

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
