package com.houlai.hx.houlaiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hx on 2020/6/23.
 */

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
