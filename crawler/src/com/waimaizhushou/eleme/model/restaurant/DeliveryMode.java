package com.waimaizhushou.eleme.model.restaurant;

/**
 * Created by azure on 2017/11/28.
 */
public class DeliveryMode{
    private String border;
    private String color;
    private Gradient gradient;
    private int id;
    private boolean isSolid;
    private String text;
    private String textColor;

    public String getBorder(){
        return border;
    }
    public void setBorder(String input){
        this.border = input;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String input){
        this.color = input;
    }
    public Gradient getGradient(){
        return gradient;
    }
    public void setGradient(Gradient input){
        this.gradient = input;
    }
    public int getId(){
        return id;
    }
    public void setId(int input){
        this.id = input;
    }
    public boolean getIsSolid(){
        return isSolid;
    }
    public void setIsSolid(boolean input){
        this.isSolid = input;
    }
    public String getText(){
        return text;
    }
    public void setText(String input){
        this.text = input;
    }
    public String getTextColor(){
        return textColor;
    }
    public void setTextColor(String input){
        this.textColor = input;
    }
}