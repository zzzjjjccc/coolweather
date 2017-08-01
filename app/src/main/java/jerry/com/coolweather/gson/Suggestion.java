package jerry.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zjc on 2017/8/1.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort conmfort;

    @SerializedName("cw")
    public CarWash carWash;

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
