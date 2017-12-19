package meituan.model.restaurant;

import java.util.List;

/**
 * Created by azure on 2017/11/30.
 */

public class MeituanRestaurant{
    private String poiid;
    private String name;
    private String frontImg;
    private String cateName;
    private int avgPrice;
    private List<Integer> scoreArr;
    private String areaName;
    private String distance;
    private int historyCouponCount;
    private String tuan;

    public String getPoiid(){
        return poiid;
    }
    public void setPoiid(String input){
        this.poiid = input;
    }
    public String getName(){
        return name;
    }
    public void setName(String input){
        this.name = input;
    }
    public String getFrontImg(){
        return frontImg;
    }
    public void setFrontImg(String input){
        this.frontImg = input;
    }
    public String getCateName(){
        return cateName;
    }
    public void setCateName(String input){
        this.cateName = input;
    }
    public int getAvgPrice(){
        return avgPrice;
    }
    public void setAvgPrice(int input){
        this.avgPrice = input;
    }
    public List<Integer> getScoreArr()
    {
        return scoreArr;
    }
    public void setScoreArr(List<Integer> scoreArr)
    {
        this.scoreArr = scoreArr;
    }
    public String getAreaName(){
        return areaName;
    }
    public void setAreaName(String input){
        this.areaName = input;
    }
    public String getDistance(){
        return distance;
    }
    public void setDistance(String input){
        this.distance = input;
    }
    public int getHistoryCouponCount(){
        return historyCouponCount;
    }
    public void setHistoryCouponCount(int input){
        this.historyCouponCount = input;
    }
    public String getTuan(){
        return tuan;
    }
    public void setTuan(String input){
        this.tuan = input;
    }
}
