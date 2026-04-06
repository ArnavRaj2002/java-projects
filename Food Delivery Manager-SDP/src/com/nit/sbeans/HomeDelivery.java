package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("home")
public class HomeDelivery implements DeliveryMethod {

	@Override
	public void deliverFood(String restaurantName, String dishName) {
	 	System.out.println("Home delivery from  "+restaurantName+" : "+dishName+" is on its way!");	

	}

}
