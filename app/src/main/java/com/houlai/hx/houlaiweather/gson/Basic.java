package com.houlai.hx.houlaiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hx on 2020/6/23.
 */

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
