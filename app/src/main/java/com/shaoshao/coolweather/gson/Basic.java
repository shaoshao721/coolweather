package com.shaoshao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Somputer on 2017/2/7 0007.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
