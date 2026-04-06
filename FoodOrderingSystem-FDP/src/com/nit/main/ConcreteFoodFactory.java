package com.nit.main;

import org.springframework.stereotype.Component;

@Component
public class ConcreteFoodFactory implements FoodFactory {

	@Override
	public Food createFood(String type, String foodType)
	
	{
		FoodType foodtype=null;
		if(foodType.equalsIgnoreCase("veg"))
			foodtype=new VegFood();
		else foodtype=new NonVegFood();
		
		Food food=null;
		 if(type.equalsIgnoreCase("pizza"))
			 food=new  Pizza(foodtype,  "medium");
		 else if(type.equalsIgnoreCase("burger"))
			 food=new Burger(foodtype, false);
		 else if(type.equalsIgnoreCase("salad"))
			 food=new Salad( foodtype, "italian");
		 else throw new IllegalArgumentException("INVALID Type !!");
		return food;
		 		 
	}

}
