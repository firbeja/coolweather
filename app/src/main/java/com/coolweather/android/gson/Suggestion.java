package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by john on 2018/1/12.
 */

//"suggestion": {
//        "air": {
//        "brf": "较差",
//        "txt": "气象条件较不利于空气污染物稀释、扩散和清除，请适当减少室外活动时间。"
//        },
//        "comf": {  //------------------------------------------------------------------------------------
//        "brf": "较不舒适",
//        "txt": "白天天气晴好，但仍会使您感觉偏冷，不很舒适，请注意适时添加衣物，以防感冒。" //-------------------------------
//        },
//        "cw": {  //---------------------------------------------------------------------------------------
//        "brf": "较适宜",
//        "txt": "较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。" //----------------------------------------
//        },
//        "drsg": {
//        "brf": "冷",
//        "txt": "天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。"
//        },
//        "flu": {
//        "brf": "较易发",
//        "txt": "天凉，昼夜温差较大，较易发生感冒，请适当增减衣服，体质较弱的朋友请注意适当防护。"
//        },
//        "sport": { //-----------------------------------------------------------------------------------
//        "brf": "较适宜",
//        "txt": "天气较好，无雨水困扰，较适宜进行各种运动，但因气温较低，在户外运动请注意增减衣物。" //----------------------
//        },
//        "trav": {
//        "brf": "适宜",
//        "txt": "天气较好，气温稍低，会感觉稍微有点凉，不过也是个好天气哦。适宜旅游，可不要错过机会呦！"
//        },
//        "uv": {
//        "brf": "中等",
//        "txt": "属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"
//        }
//        }

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("sport")
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }

}
