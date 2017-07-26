package notes.example.wang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Wang on 2017/7/26.
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
