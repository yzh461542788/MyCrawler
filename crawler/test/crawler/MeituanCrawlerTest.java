package crawler;

import consts.Consts;
import meituan.model.MeituanRestaurant;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* MeituanCrawler Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®Ò»ÔÂ 30, 2017</pre> 
* @version 1.0 
*/ 
public class MeituanCrawlerTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: get15Restaurants(String latitude, String longitude, int start) 
* 
*/ 
@Test
public void testGet15Restaurants() throws Exception {
    System.out.println(MeituanCrawler.get15RestaurantsJson(Consts.DEFAULT_LATITUDE, Consts.DEFAULT_LONGITUDE, 0) );
    List<MeituanRestaurant> meituanRestaurants = MeituanCrawler.get15Restaurants(Consts.DEFAULT_LATITUDE, Consts.DEFAULT_LONGITUDE, 0);
    System.out.println(meituanRestaurants.get(0).getName() );
} 

/** 
* 
* Method: getMenu(int restaurantId) 
* 
*/ 
@Test
public void testGetMenu() throws Exception { 
//TODO: Test goes here... 
} 


} 
