package com.nit.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class FoodService {
	@Autowired
	FoodFactory foodFactory;
	 
	//here i why not call foodFactory.createFood();
	String orderFood(String type, String foodType) {
		Food food = foodFactory.createFood(type, foodType);
		 return food.prepareFood();
		 
	}
	 
}
