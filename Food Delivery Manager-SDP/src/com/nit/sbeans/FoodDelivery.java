package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FoodDelivery {
	@Autowired
	@Qualifier("home")
	private DeliveryMethod deliveryMethod;

	public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public void executeDelivery(String restaurantName, String dishName) {
		deliveryMethod.deliverFood(restaurantName, dishName);
	}
}
