package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Y410P on 2017/12/8.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherID;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
