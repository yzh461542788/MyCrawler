package com.waimaizhushou.eleme.model.restaurant;

/**
 * Created by azure on 2017/11/28.
 */
public class Supports{
    private String description;
    private String iconColor;
    private String iconName;
    private int id;
    private String name;

    public String getDescription(){
        return description;
    }
    public void setDescription(String input){
        this.description = input;
    }
    public String getIconColor(){
        return iconColor;
    }
    public void setIconColor(String input){
        this.iconColor = input;
    }
    public String getIconName(){
        return iconName;
    }
    public void setIconName(String input){
        this.iconName = input;
    }
    public int getId(){
        return id;
    }
    public void setId(int input){
        this.id = input;
    }
    public String getName(){
        return name;
    }
    public void setName(String input){
        this.name = input;
    }
}