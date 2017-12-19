package com.waimaizhushou.crawler;

import com.waimaizhushou.consts.Consts;
import com.waimaizhushou.eleme.model.menu.ElemeMenu;
import com.waimaizhushou.eleme.model.restaurant.ElemeRestaurant;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;
//import java.util.stream.Collectors;

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
    List<ElemeMenu> menus = ElemeCrawler.getMenu(rests.get(0).getId() );
//    menus.stream().forEach(
//            m -> System.out.println(m.getDescription() + "\n"
//                        + String.join("\n",  m.getFoods().stream()
//                                .map(food ->
//                                        food.getName() + " " + food.getSpecfoods().get(0).getPrice() + " " + food.getDescription() )
//                                .collect(Collectors.toList() ) )
//                )
//    );
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
