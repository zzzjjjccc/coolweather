package jerry.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zjc on 2017/8/1.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
