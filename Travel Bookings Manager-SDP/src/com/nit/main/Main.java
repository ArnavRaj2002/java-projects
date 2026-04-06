package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;
import com.nit.sbeans.TravelBooking;

public class Main {

	public static void main(String[] args) {
 try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class))
 {
	 TravelBooking travelBooking = ctx.getBean(TravelBooking.class);
	  travelBooking.executeBooking("Hyderabad",5000.00);
 }
 catch(Exception e) {
	 e.printStackTrace();
 }
	}

}
