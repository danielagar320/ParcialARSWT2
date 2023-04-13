package edu.eci.arsw.myrestaurant.beans;

import edu.eci.arsw.myrestaurant.model.Order;
import edu.eci.arsw.myrestaurant.model.RestaurantProduct;
import edu.eci.arsw.myrestaurant.services.RestaurantOrderServicesStub;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;


public interface BillCalculator {


	
	public int calculateBill(Order o,Map<String,RestaurantProduct> productsMap) ;
	
}
