package com.coolweather.android.gson;

/**
 * Created by Y410P on 2017/12/8.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
