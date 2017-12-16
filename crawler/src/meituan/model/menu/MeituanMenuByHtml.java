package meituan.model.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by azure on 2017/12/16.
 */
public class MeituanMenuByHtml
{
    private List<MeituanFoodByHtml> foods;
    private String name;

    public MeituanMenuByHtml(String name){
        this.name = name;
        this.foods = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<MeituanFoodByHtml> getFoods()
    {
        return foods;
    }

    public void setFoods(List<MeituanFoodByHtml> foods)
    {
        this.foods = foods;
    }

    @Override public String toString()
    {
        return name + "\n" + String.join("\n", foods.stream().map(MeituanFoodByHtml::toString).collect(Collectors.toList() ) );
    }
}
