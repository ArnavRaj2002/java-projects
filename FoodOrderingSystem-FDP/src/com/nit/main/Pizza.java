package com.nit.main;

public class Pizza implements Food{
private FoodType type;
private String size;

public Pizza(FoodType type, String size) {
	super();
	this.type = type;
	this.size = size;
}

@Override
public String prepareFood() {

	return "Preparing  "+type.getFoodType()+" Pizza ("+size + " Size)";
}
}
