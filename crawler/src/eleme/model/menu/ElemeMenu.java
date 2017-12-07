package eleme.model.menu;

import java.util.List;

/**
 * Created by azure on 2017/11/28.
 */
public class ElemeMenu
{
    private String description;
    private boolean isSelected;
    private String iconUrl;
    private String name;
    private String greyIconUrl;
    private List<Foods> foods;
    private Activity activity;
    private int type;
    private int id;
    private IsActivity isActivity;

    public String getDescription(){
        return description;
    }
    public void setDescription(String input){
        this.description = input;
    }
    public boolean getIsSelected(){
        return isSelected;
    }
    public void setIsSelected(boolean input){
        this.isSelected = input;
    }
    public String getIconUrl(){
        return iconUrl;
    }
    public void setIconUrl(String input){
        this.iconUrl = input;
    }
    public String getName(){
        return name;
    }
    public void setName(String input){
        this.name = input;
    }
    public String getGreyIconUrl(){
        return greyIconUrl;
    }
    public void setGreyIconUrl(String input){
        this.greyIconUrl = input;
    }
    public List<Foods> getFoods(){
        return foods;
    }
    public void setFoods(List<Foods> input){
        this.foods = input;
    }
    public Activity getActivity(){
        return activity;
    }
    public void setActivity(Activity input){
        this.activity = input;
    }
    public int getType(){
        return type;
    }
    public void setType(int input){
        this.type = input;
    }
    public int getId(){
        return id;
    }
    public void setId(int input){
        this.id = input;
    }
    public IsActivity getIsActivity(){
        return isActivity;
    }
    public void setIsActivity(IsActivity input){
        this.isActivity = input;
    }
}