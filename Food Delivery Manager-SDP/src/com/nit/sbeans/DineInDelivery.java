package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("dine")
public class DineInDelivery implements DeliveryMethod{

	@Override
	public void deliverFood(String restaurantName, String dishName) {
 	System.out.println("Dine-in at  "+restaurantName+" : Enjoying  "+dishName);	
	}

}
