package crawler;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import eleme.model.restaurant.ElemeRestaurant;
import http.HttpGetBasic;
import meituan.model.MeituanRestaurant;
import util.GsonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by azure on 2017/11/27.
 */
public class MeituanCrawler extends HttpGetBasic
{

    public static List<MeituanRestaurant> get15Restaurants(String latitude, String longitude, int num)
    {
        try {
            String rawJson = get15RestaurantsJson(latitude, longitude, num * 15);
            String restaurantsJson = new JsonParser().parse(rawJson).getAsJsonObject().get("poiList")
                    .getAsJsonObject().get("20639").getAsJsonArray().toString();
            List<MeituanRestaurant> restaurants = GsonUtil.parseJsonArrayWithGson(restaurantsJson,
                    MeituanRestaurant.class);
            return restaurants;
        } catch(Exception e) {
            return new ArrayList<>();
        }
    }

    public static String get15RestaurantsJson(String latitude, String longitude, int start)
    {
        String requestUrl = "https://i.meituan.com/brunch/applet/index?&tag=food&page=0&firstTime=0";
        requestUrl = requestUrl + "&lat=" +latitude + "&lng=" + longitude + "&page=" + (start / 15);
        return httpGet(requestUrl);
    }

    public static String getMenuJson(int restaurantId)
    {
        String requestUrl = "https://i.meituan.com/brunch/applet/poi?id=";
        requestUrl = requestUrl + restaurantId;
        return httpGet(requestUrl);
    }
}
