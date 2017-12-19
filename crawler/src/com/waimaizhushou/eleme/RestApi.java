package com.waimaizhushou.eleme;

import com.waimaizhushou.http.HttpGetBasic;

/**
 * Created by azure on 2017/11/27.
 */
public class RestApi extends HttpGetBasic
{

    public static String get30Restaurants(String latitude, String longitude, int start)
    {
        String requestUrl = "https://www.ele.me/restapi/shopping/restaurants?extras%5B%5D=activities&geohash=wtw3qvvse6g&limit=30&terminal=web";
        requestUrl = requestUrl + "&latitude=" +latitude + "&longitude=" + longitude + "&offset=" + start;
        return httpGet(requestUrl);
    }

    public static String getMenu(int restaurantId)
    {
        String requestUrl = "https://www.ele.me/restapi/shopping/v2/menu?restaurant_id=";
        requestUrl = requestUrl + restaurantId;
        return httpGet(requestUrl);
    }

}
