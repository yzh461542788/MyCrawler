package crawler;

import consts.Consts;
import eleme.model.menu.ElemeMenu;
import eleme.model.restaurant.ElemeRestaurant;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* ElemeCrawler Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®Ò»ÔÂ 28, 2017</pre> 
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
    List<ElemeRestaurant> rests = ElemeCrawler.get30Restaurants(Consts.DEFAULT_LATITUDE, Consts.DEFAULT_LONGITUDE, 0);
    System.out.println(rests.get(0).getName() );
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
    List<ElemeMenu> menus = ElemeCrawler.getMenu(767630);
    System.out.println(menus.get(0).getName() );
} 


} 
