package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;
import com.nit.sbeans.VehicleService;

public class Main {
public static void main(String[] args) {
	try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class)){
		VehicleService vehicleService = ctx.getBean(VehicleService.class);
		System.out.println(vehicleService.createVehicle("car", "electric"));
		System.out.println(vehicleService.createVehicle("truck", "Diesel"));
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
