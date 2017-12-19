package com.waimaizhushou.eleme.model.menu;

import java.util.List;

/**
 * Created by azure on 2017/11/28.
 */
public class Foods{
    private int rating;
    private int isFeatured;
    private int virtualFoodId;
    private ColdBox coldBox;
    private int restaurantId;
    private String pinyinName;
    private List<DisplayTimes> displayTimes;
    private List<Attrs> attrs;
    private String description;
    private int monthSales;
    private int ratingCount;
    private String tips;
    private String imagePath;
    private List<Specifications> specifications;
    private int serverUtc;
    private boolean isEssential;
    private List<Attributes> attributes;
    private String itemId;
    private int minPurchase;
    private Limitation limitation;
    private String name;
    private int satisfyCount;
    private Activity activity;
    private int satisfyRate;
    private List<Specfoods> specfoods;
    private int categoryId;

    public int getRating(){
        return rating;
    }
    public void setRating(int input){
        this.rating = input;
    }
    public int getIsFeatured(){
        return isFeatured;
    }
    public void setIsFeatured(int input){
        this.isFeatured = input;
    }
    public int getVirtualFoodId(){
        return virtualFoodId;
    }
    public void setVirtualFoodId(int input){
        this.virtualFoodId = input;
    }
    public ColdBox getColdBox(){
        return coldBox;
    }
    public void setColdBox(ColdBox input){
        this.coldBox = input;
    }
    public int getRestaurantId(){
        return restaurantId;
    }
    public void setRestaurantId(int input){
        this.restaurantId = input;
    }
    public String getPinyinName(){
        return pinyinName;
    }
    public void setPinyinName(String input){
        this.pinyinName = input;
    }
    public List<DisplayTimes> getDisplayTimes(){
        return displayTimes;
    }
    public void setDisplayTimes(List<DisplayTimes> input){
        this.displayTimes = input;
    }
    public List<Attrs> getAttrs(){
        return attrs;
    }
    public void setAttrs(List<Attrs> input){
        this.attrs = input;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String input){
        this.description = input;
    }
    public int getMonthSales(){
        return monthSales;
    }
    public void setMonthSales(int input){
        this.monthSales = input;
    }
    public int getRatingCount(){
        return ratingCount;
    }
    public void setRatingCount(int input){
        this.ratingCount = input;
    }
    public String getTips(){
        return tips;
    }
    public void setTips(String input){
        this.tips = input;
    }
    public String getImagePath(){
        return imagePath;
    }
    public void setImagePath(String input){
        this.imagePath = input;
    }
    public List<Specifications> getSpecifications(){
        return specifications;
    }
    public void setSpecifications(List<Specifications> input){
        this.specifications = input;
    }
    public int getServerUtc(){
        return serverUtc;
    }
    public void setServerUtc(int input){
        this.serverUtc = input;
    }
    public boolean getIsEssential(){
        return isEssential;
    }
    public void setIsEssential(boolean input){
        this.isEssential = input;
    }
    public List<Attributes> getAttributes(){
        return attributes;
    }
    public void setAttributes(List<Attributes> input){
        this.attributes = input;
    }
    public String getItemId(){
        return itemId;
    }
    public void setItemId(String input){
        this.itemId = input;
    }
    public int getMinPurchase(){
        return minPurchase;
    }
    public void setMinPurchase(int input){
        this.minPurchase = input;
    }
    public Limitation getLimitation(){
        return limitation;
    }
    public void setLimitation(Limitation input){
        this.limitation = input;
    }
    public String getName(){
        return name;
    }
    public void setName(String input){
        this.name = input;
    }
    public int getSatisfyCount(){
        return satisfyCount;
    }
    public void setSatisfyCount(int input){
        this.satisfyCount = input;
    }
    public Activity getActivity(){
        return activity;
    }
    public void setActivity(Activity input){
        this.activity = input;
    }
    public int getSatisfyRate(){
        return satisfyRate;
    }
    public void setSatisfyRate(int input){
        this.satisfyRate = input;
    }
    public List<Specfoods> getSpecfoods(){
        return specfoods;
    }
    public void setSpecfoods(List<Specfoods> input){
        this.specfoods = input;
    }
    public int getCategoryId(){
        return categoryId;
    }
    public void setCategoryId(int input){
        this.categoryId = input;
    }
}