package crawler;

import eleme.model.menu.ElemeMenu;
import eleme.model.restaurant.ElemeRestaurant;
import http.HttpGetBasic;
import util.GsonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by azure on 2017/11/27.
 */
public class ElemeCrawler extends HttpGetBasic
{
    public static List<ElemeMenu> getMenu(int restaurantId)
    {
        try {
            String menuJson = getMenuJson(restaurantId);
            List<ElemeMenu> menus = GsonUtil.parseJsonArrayWithGson(menuJson,
                    ElemeMenu.class);
            return menus;
        } catch(Exception e) {
            return new ArrayList<>();
        }
    }

    public static List<ElemeRestaurant> get30Restaurants(String latitude, String longitude, int num)
    {
        try {
            String restaurantsJson = get30RestaurantsJson(latitude, longitude, num * 30);
            List<ElemeRestaurant> restaurants = GsonUtil.parseJsonArrayWithGson(restaurantsJson,
                    ElemeRestaurant.class);
            return restaurants;
        } catch(Exception e) {
            return new ArrayList<>();
        }
    }

    public static String get30RestaurantsJson(String latitude, String longitude, int start)
    {
        String requestUrl = "https://www.ele.me/restapi/shopping/restaurants?extras%5B%5D=activities&geohash=wtw3qvvse6g&limit=30&terminal=web";
        requestUrl = requestUrl + "&latitude=" +latitude + "&longitude=" + longitude + "&offset=" + start;
        return httpGet(requestUrl);
    }

    public static String getMenuJson(int restaurantId)
    {
        String requestUrl = "https://www.ele.me/restapi/shopping/v2/menu?restaurant_id=";
        requestUrl = requestUrl + restaurantId;
        return httpGet(requestUrl);
    }
}