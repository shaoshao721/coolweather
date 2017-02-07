package com.shaoshao.coolweather.gson;

/**
 * Created by Somputer on 2017/2/7 0007.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
