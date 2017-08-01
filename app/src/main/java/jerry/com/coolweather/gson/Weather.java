package jerry.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zjc on 2017/8/1.
 */

public class Weather {
    //返回的天气数据中， 成功返回OK，失败会返回具体的原因。
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
