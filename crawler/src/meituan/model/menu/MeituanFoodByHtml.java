package meituan.model.menu;

import java.text.DecimalFormat;

/**
 * Created by azure on 2017/12/11.
 */
public class MeituanFoodByHtml
{
    private String name;
    private String img;
    private String desc;
    private double price;

    public MeituanFoodByHtml(String name, String img, String desc, double price)
    {
        this.name = name;
        this.img = img;
        this.desc = desc;
        this.price = price;
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
    public void setPrice(double price)
    {
        this.price = price;
    }
    public double getPrice(double input){
        return price;
    }

    @Override public String toString(){

        return name + " " + new DecimalFormat("#.00").format(price) + " " + desc;
    }
}