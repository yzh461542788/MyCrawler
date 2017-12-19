package crawler;

import consts.Consts;
import eleme.model.menu.ElemeMenu;
import eleme.model.menu.Foods;
import eleme.model.restaurant.ElemeRestaurant;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* ElemeCrawler Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮһ�� 28, 2017</pre> 
* @version 1.0 
*/ 
public class ElemeCrawlerTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: get30RestaurantsModel(String latitude, String longitude, int num) 
* 
*/ 
@Test
public void testGet30RestaurantsModel() throws Exception {
    List<ElemeRestaurant> rests = ElemeCrawler.get30Restaurants(Consts.DEFAULT_LATITUDE, Consts.DEFAULT_LONGITUDE, 0);  //  get first 30 restaurants
    System.out.println(rests.get(0).getName() );
    List<ElemeRestaurant> rests2 = ElemeCrawler.get30Restaurants(Consts.DEFAULT_LATITUDE, Consts.DEFAULT_LONGITUDE, 1);  //  get 31-60
    List<ElemeMenu> menus = ElemeCrawler.getMenu(rests.get(0).getId(), Consts.DEFAULT_LATITUDE, Consts.DEFAULT_LONGITUDE);
    for(ElemeMenu m : menus)
    {
        String s = m.getDescription() + "\n";
        for(Foods food : m.getFoods() )
            s += food.getName() + " " + food.getSpecfoods().get(0).getPrice() + " " + food.getDescription();
        System.out.println(s);
    }
}

/** 
* 
* Method: get30RestaurantsJson(String latitude, String longitude, int start)
* 
*/ 
@Test
public void testGet30Restaurants() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getMenu(int restaurantId)
* 
*/ 
@Test
public void testGetMenu() throws Exception {
} 


} 
