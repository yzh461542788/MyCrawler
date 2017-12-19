package com.waimaizhushou.meituan.model.restaurant;

/**
 * Created by azure on 2017/12/11.
 */
public class MeituanRestaurantByHtml{
    private String id;
    private String name;
    private String img;
    private String desc;
    private int startPrice;
    private int sendPrice;
    private String sendTime;
    private String score;
    private String url;

    public MeituanRestaurantByHtml(String id, String name, String img, String desc, int startPrice, int sendPrice, String sendTime, String score, String url)
    {
        this.id = id;
        this.name = name;
        this.img = img;
        this.desc = desc;
        this.startPrice = startPrice;
        this.sendPrice = sendPrice;
        this.sendTime = sendTime;
        this.score = score;
        this.url = url;
    }

    public String getId(){
        return id;
    }
    public void setId(String input){
        this.id = input;
    }
    public String getName(){
        return name;
    }
    public void setName(String input){
        this.name = input;
    }
    public String getImg(){
        return img;
    }
    public void setImg(String input){
        this.img = input;
    }
    public String getDesc(){
        return desc;
    }
    public void setDesc(String input){
        this.desc = input;
    }
    public int getStartPrice(){
        return startPrice;
    }
    public int getSendPrice()
    {
        return sendPrice;
    }
    public void setSendPrice(int sendPrice)
    {
        this.sendPrice = sendPrice;
    }
    public void setStartPrice(int input){
        this.startPrice = input;
    }
    public String getSendTime(){
        return sendTime;
    }
    public void setSendTime(String input){
        this.sendTime = input;
    }
    public String getScore(){
        return score;
    }
    public void setScore(String input){
        this.score = input;
    }
    public String getUrl(){
        return url;
    }
    public void setUrl(String input){
        this.url = input;
    }
}