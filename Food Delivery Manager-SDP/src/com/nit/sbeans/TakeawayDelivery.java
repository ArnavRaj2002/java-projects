package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("take")
public class TakeawayDelivery implements DeliveryMethod {

	@Override
	public void deliverFood(String restaurantName, String dishName) {
	 	System.out.println("Takeaway from  "+restaurantName+" : Ready to pick up  "+dishName);	

	}

}
