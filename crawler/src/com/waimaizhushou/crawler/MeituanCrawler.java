package com.waimaizhushou.crawler;

import com.google.gson.JsonParser;
import com.waimaizhushou.http.HttpGetBasic;
import com.waimaizhushou.meituan.model.menu.MeituanFoodByHtml;
import com.waimaizhushou.meituan.model.menu.MeituanMenuByHtml;
import com.waimaizhushou.meituan.model.restaurant.MeituanRestaurant;
import com.waimaizhushou.meituan.model.restaurant.MeituanRestaurantByHtml;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import com.waimaizhushou.util.GsonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by azure on 2017/11/27.
 */
public class MeituanCrawler extends HttpGetBasic
{
    public static List<MeituanMenuByHtml> getMenu(int restaurantId)
    {
        return getMenu("com.waimaizhushou.http://waimai.com.waimaizhushou.meituan.com/restaurant/" + restaurantId);
    }

    public static List<MeituanMenuByHtml> getMenu(MeituanRestaurantByHtml restaurant)
    {
        return getMenu(restaurant.getUrl() );
    }


    public static List<MeituanMenuByHtml> getMenu(String url)
    {
        List<MeituanMenuByHtml> ret = new ArrayList<>();
        String content = httpGet(url);
        Document searchDoc = Jsoup.parse(content, url);
        Elements menuElements = searchDoc.select("div.category");
        for(Element menuElement : menuElements)
        {
            String name = "";
            try {
                name = menuElement.select("span.tag-na").text();
            } catch(Exception e) {
                e.printStackTrace();
            }
            Elements contents = menuElement.select(".j-pic-food");
            MeituanMenuByHtml menu = new MeituanMenuByHtml(name);
            ret.add(menu);
            for(Element c: contents)
            {
                try{
                    String img = c.select("div.avatar > img").get(0).attr("data-src");
                    String desc = c.select(".description").size() > 0 ? c.select(".description").get(0).text() : "";
                    String foodName = c.select("span.name").get(0).text();
                    double price = Double.parseDouble(c.select("div.price").get(0).text().replace("¥", ""));
                    menu.getFoods().add(new MeituanFoodByHtml(foodName, img, desc, price));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return ret;
    }

    public static List<MeituanRestaurantByHtml> getRestaurantsByHtml()
    {
        String requestUrl = "com.waimaizhushou.http://waimai.com.waimaizhushou.meituan.com/home/wtw3rnfw1djv";
        String content = httpGet(requestUrl);
        List<MeituanRestaurantByHtml> ret = new ArrayList<>();
        Document searchDoc = Jsoup.parse(content, requestUrl);
        Elements contents = searchDoc.select("div.restaurant");
        for(Element c: contents) {
            try{
                String name = c.attr("data-title");
                String desc = c.attr("data-bulletin");
                String url = "com.waimaizhushou.http://waimai.com.waimaizhushou.meituan.com" + c.select("a.rest-atag").get(0).attr("href");
                String img = c.select("img.scroll-loading").get(0).attr("src");
                String score = c.select("span.score-num").get(0).text();
                int startPrice = Integer.parseInt(c.select("span.start-price").get(0).text().replace("起送:￥", ""));
                String sendPriceStr = c.select("span.send-price").get(0).text().replace("配送费:￥", "");
                int sendPrice = sendPriceStr.contains("免") ? 0 : Integer.parseInt(sendPriceStr);
                String sendTime = c.select("span.send-time").get(0).text();
                String id = c.select("a.un-favorite").get(0).attr("data-poiid");
                MeituanRestaurantByHtml restaurant = new MeituanRestaurantByHtml(id, name, img, desc, startPrice, sendPrice, sendTime, score, url);
                ret.add(restaurant);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ret;
    }

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
        String requestUrl = "https://i.com.waimaizhushou.meituan.com/brunch/applet/index?&tag=food&page=0&firstTime=0";
        requestUrl = requestUrl + "&lat=" +latitude + "&lng=" + longitude + "&page=" + (start / 15);
        return httpGet(requestUrl);
    }

    public static String getMenuJson(int restaurantId)
    {
        String requestUrl = "https://i.com.waimaizhushou.meituan.com/brunch/applet/poi?id=";
        requestUrl = requestUrl + restaurantId;
        return httpGet(requestUrl);
    }
}
