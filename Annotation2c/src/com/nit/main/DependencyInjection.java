package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;
import com.nit.sbeans.TravelAgency;

public class DependencyInjection {

	public static void main(String[] args) {
     try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class))
     {
    	 TravelAgency travelAgency = ctx.getBean(TravelAgency.class);
    	 travelAgency.printInfo("HYDERABAD");
     }
     catch(Exception e) {
    	 e.printStackTrace();
     }
	}

}
