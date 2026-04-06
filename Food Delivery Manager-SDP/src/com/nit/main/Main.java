package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;
import com.nit.sbeans.FoodDelivery;

public class Main {

	public static void main(String[] args) {
 try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class))
 {
	 FoodDelivery foodDelivery = ctx.getBean(FoodDelivery.class);
	 foodDelivery.executeDelivery("Paradise", "Biryani");
 }
 catch(Exception e)
 {
	 e.printStackTrace();
 }
	}

}
