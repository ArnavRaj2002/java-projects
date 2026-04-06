package com.nit.main;

public class Burger implements Food {
private FoodType type;
private boolean extraCheese;

public Burger(FoodType type, boolean extraCheese) {
	super();
	this.type = type;
	this.extraCheese = extraCheese;
}

@Override
public String prepareFood() {
	return "Preparing  "+type.getFoodType()+"Burger ; is Burger with Extra Cheese??= "+extraCheese;

}
}
