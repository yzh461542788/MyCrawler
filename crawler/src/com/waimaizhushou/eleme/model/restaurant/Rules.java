package com.waimaizhushou.eleme.model.restaurant;

/**
 * Created by azure on 2017/11/28.
 */
public class Rules{
    private int fee;
    private int price;

    public int getFee(){
        return fee;
    }
    public void setFee(int input){
        this.fee = input;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int input){
        this.price = input;
    }
}