package eleme.model.restaurant;

import java.util.List;

/**
 * Created by azure on 2017/11/28.
 */
public class ElemeRestaurant{
    private List<Activities> activities;
    private String address;
    private int authenticId;
    private DeliveryMode deliveryMode;
    private String description;
    private int distance;
    private boolean favored;
    private int floatDeliveryFee;
    private int floatMinimumOrderAmount;
    private int id;
    private String imagePath;
    private boolean isNew;
    private boolean isPremium;
    private int isStockEmpty;
    private int isValid;
    private int latitude;
    private int longitude;
    private int maxAppliedQuantityPerOrder;
    private String name;
    private String nextBusinessTime;
    private List<String> openingHours;
    private boolean onlyUsePoi;
    private int orderLeadTime;
    private String phone;
    private PiecewiseAgentFee piecewiseAgentFee;
    private String promotionInfo;
    private int rating;
    private int ratingCount;
    private int recentOrderNum;
    private Recommend recommend;
    private int regularCustomerCount;
    private String scheme;
    private int status;
    private List<Supports> supports;
    private int type;

    public List<Activities> getActivities(){
        return activities;
    }
    public void setActivities(List<Activities> input){
        this.activities = input;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String input){
        this.address = input;
    }
    public int getAuthenticId(){
        return authenticId;
    }
    public void setAuthenticId(int input){
        this.authenticId = input;
    }
    public DeliveryMode getDeliveryMode(){
        return deliveryMode;
    }
    public void setDeliveryMode(DeliveryMode input){
        this.deliveryMode = input;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String input){
        this.description = input;
    }
    public int getDistance(){
        return distance;
    }
    public void setDistance(int input){
        this.distance = input;
    }
    public boolean getFavored(){
        return favored;
    }
    public void setFavored(boolean input){
        this.favored = input;
    }
    public int getFloatDeliveryFee(){
        return floatDeliveryFee;
    }
    public void setFloatDeliveryFee(int input){
        this.floatDeliveryFee = input;
    }
    public int getFloatMinimumOrderAmount(){
        return floatMinimumOrderAmount;
    }
    public void setFloatMinimumOrderAmount(int input){
        this.floatMinimumOrderAmount = input;
    }
    public int getId(){
        return id;
    }
    public void setId(int input){
        this.id = input;
    }
    public String getImagePath(){
        return imagePath;
    }
    public void setImagePath(String input){
        this.imagePath = input;
    }
    public boolean getIsNew(){
        return isNew;
    }
    public void setIsNew(boolean input){
        this.isNew = input;
    }
    public boolean getIsPremium(){
        return isPremium;
    }
    public void setIsPremium(boolean input){
        this.isPremium = input;
    }
    public int getIsStockEmpty(){
        return isStockEmpty;
    }
    public void setIsStockEmpty(int input){
        this.isStockEmpty = input;
    }
    public int getIsValid(){
        return isValid;
    }
    public void setIsValid(int input){
        this.isValid = input;
    }
    public int getLatitude(){
        return latitude;
    }
    public void setLatitude(int input){
        this.latitude = input;
    }
    public int getLongitude(){
        return longitude;
    }
    public void setLongitude(int input){
        this.longitude = input;
    }
    public int getMaxAppliedQuantityPerOrder(){
        return maxAppliedQuantityPerOrder;
    }
    public void setMaxAppliedQuantityPerOrder(int input){
        this.maxAppliedQuantityPerOrder = input;
    }
    public String getName(){
        return name;
    }
    public void setName(String input){
        this.name = input;
    }
    public String getNextBusinessTime(){
        return nextBusinessTime;
    }
    public void setNextBusinessTime(String input){
        this.nextBusinessTime = input;
    }
    public List<String> getOpeningHours()
    {
        return openingHours;
    }

    public void setOpeningHours(List<String> openingHours)
    {
        this.openingHours = openingHours;
    }
    public boolean getOnlyUsePoi(){
        return onlyUsePoi;
    }
    public void setOnlyUsePoi(boolean input){
        this.onlyUsePoi = input;
    }
    public int getOrderLeadTime(){
        return orderLeadTime;
    }
    public void setOrderLeadTime(int input){
        this.orderLeadTime = input;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String input){
        this.phone = input;
    }
    public PiecewiseAgentFee getPiecewiseAgentFee(){
        return piecewiseAgentFee;
    }
    public void setPiecewiseAgentFee(PiecewiseAgentFee input){
        this.piecewiseAgentFee = input;
    }
    public String getPromotionInfo(){
        return promotionInfo;
    }
    public void setPromotionInfo(String input){
        this.promotionInfo = input;
    }
    public int getRating(){
        return rating;
    }
    public void setRating(int input){
        this.rating = input;
    }
    public int getRatingCount(){
        return ratingCount;
    }
    public void setRatingCount(int input){
        this.ratingCount = input;
    }
    public int getRecentOrderNum(){
        return recentOrderNum;
    }
    public void setRecentOrderNum(int input){
        this.recentOrderNum = input;
    }
    public Recommend getRecommend(){
        return recommend;
    }
    public void setRecommend(Recommend input){
        this.recommend = input;
    }
    public int getRegularCustomerCount(){
        return regularCustomerCount;
    }
    public void setRegularCustomerCount(int input){
        this.regularCustomerCount = input;
    }
    public String getScheme(){
        return scheme;
    }
    public void setScheme(String input){
        this.scheme = input;
    }
    public int getStatus(){
        return status;
    }
    public void setStatus(int input){
        this.status = input;
    }
    public List<Supports> getSupports(){
        return supports;
    }
    public void setSupports(List<Supports> input){
        this.supports = input;
    }
    public int getType(){
        return type;
    }
    public void setType(int input){
        this.type = input;
    }
}