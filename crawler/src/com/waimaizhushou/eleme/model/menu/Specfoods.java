package com.waimaizhushou.eleme.model.menu;

import java.util.List;

/**
 * Created by azure on 2017/11/28.
 */
public class Specfoods{
    private OriginalPrice originalPrice;
    private String skuId;
    private String name;
    private int weight;
    private int virtualFoodId;
    private String pinyinName;
    private int restaurantId;
    private int foodId;
    private int packingFee;
    private int recentRating;
    private int promotionStock;
    private int price;
    private boolean soldOut;
    private int recentPopularity;
    private boolean isEssential;
    private String itemId;
    private int checkoutMode;
    private List<Specs> specs;
    private PartialReduceActivityId partialReduceActivityId;
    private int stock;

    public OriginalPrice getOriginalPrice(){
        return originalPrice;
    }
    public void setOriginalPrice(OriginalPrice input){
        this.originalPrice = input;
    }
    public String getSkuId(){
        return skuId;
    }
    public void setSkuId(String input){
        this.skuId = input;
    }
    public String getName(){
        return name;
    }
    public void setName(String input){
        this.name = input;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int input){
        this.weight = input;
    }
    public int getVirtualFoodId(){
        return virtualFoodId;
    }
    public void setVirtualFoodId(int input){
        this.virtualFoodId = input;
    }
    public String getPinyinName(){
        return pinyinName;
    }
    public void setPinyinName(String input){
        this.pinyinName = input;
    }
    public int getRestaurantId(){
        return restaurantId;
    }
    public void setRestaurantId(int input){
        this.restaurantId = input;
    }
    public int getFoodId(){
        return foodId;
    }
    public void setFoodId(int input){
        this.foodId = input;
    }
    public int getPackingFee(){
        return packingFee;
    }
    public void setPackingFee(int input){
        this.packingFee = input;
    }
    public int getRecentRating(){
        return recentRating;
    }
    public void setRecentRating(int input){
        this.recentRating = input;
    }
    public int getPromotionStock(){
        return promotionStock;
    }
    public void setPromotionStock(int input){
        this.promotionStock = input;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int input){
        this.price = input;
    }
    public boolean getSoldOut(){
        return soldOut;
    }
    public void setSoldOut(boolean input){
        this.soldOut = input;
    }
    public int getRecentPopularity(){
        return recentPopularity;
    }
    public void setRecentPopularity(int input){
        this.recentPopularity = input;
    }
    public boolean getIsEssential(){
        return isEssential;
    }
    public void setIsEssential(boolean input){
        this.isEssential = input;
    }
    public String getItemId(){
        return itemId;
    }
    public void setItemId(String input){
        this.itemId = input;
    }
    public int getCheckoutMode(){
        return checkoutMode;
    }
    public void setCheckoutMode(int input){
        this.checkoutMode = input;
    }
    public List<Specs> getSpecs(){
        return specs;
    }
    public void setSpecs(List<Specs> input){
        this.specs = input;
    }
    public PartialReduceActivityId getPartialReduceActivityId(){
        return partialReduceActivityId;
    }
    public void setPartialReduceActivityId(PartialReduceActivityId input){
        this.partialReduceActivityId = input;
    }
    public int getStock(){
        return stock;
    }
    public void setStock(int input){
        this.stock = input;
    }
}