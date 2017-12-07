package eleme.model.restaurant;

/**
 * Created by azure on 2017/11/28.
 */

public class Activities{
    private String attribute;
    private String description;
    private String iconColor;
    private String iconName;
    private int id;
    private boolean isExclusiveWithFoodActivity;
    private String name;
    private String tips;
    private int type;

    public String getAttribute(){
        return attribute;
    }
    public void setAttribute(String input){
        this.attribute = input;
    }
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
    public boolean getIsExclusiveWithFoodActivity(){
        return isExclusiveWithFoodActivity;
    }
    public void setIsExclusiveWithFoodActivity(boolean input){
        this.isExclusiveWithFoodActivity = input;
    }
    public String getName(){
        return name;
    }
    public void setName(String input){
        this.name = input;
    }
    public String getTips(){
        return tips;
    }
    public void setTips(String input){
        this.tips = input;
    }
    public int getType(){
        return type;
    }
    public void setType(int input){
        this.type = input;
    }
}