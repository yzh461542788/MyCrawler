package com.waimaizhushou.eleme.model.restaurant;

import java.util.List;

/**
 * Created by azure on 2017/11/28.
 */
public class PiecewiseAgentFee{
    private String description;
    private int extraFee;
    private boolean isExtra;
    private List<Rules> rules;
    private String tips;

    public String getDescription(){
        return description;
    }
    public void setDescription(String input){
        this.description = input;
    }
    public int getExtraFee(){
        return extraFee;
    }
    public void setExtraFee(int input){
        this.extraFee = input;
    }
    public boolean getIsExtra(){
        return isExtra;
    }
    public void setIsExtra(boolean input){
        this.isExtra = input;
    }
    public List<Rules> getRules(){
        return rules;
    }
    public void setRules(List<Rules> input){
        this.rules = input;
    }
    public String getTips(){
        return tips;
    }
    public void setTips(String input){
        this.tips = input;
    }
}