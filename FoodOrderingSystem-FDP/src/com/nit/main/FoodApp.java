package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FoodApp {

	public static void main(String[] args) {
 try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class)){
  FoodService foodService = ctx.getBean(FoodService.class);
  System.out.println(foodService.orderFood("pizza", "veg"));
  System.out.println(foodService.orderFood("BURGER", "nonveg"));
  System.out.println(foodService.orderFood("salad", "nonveg"));

 }
 catch(Exception e) {
	 e.printStackTrace();
 }
	}

}
