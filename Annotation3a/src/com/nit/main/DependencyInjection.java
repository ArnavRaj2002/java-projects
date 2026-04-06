package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;
import com.nit.sbeans.ServiceCenter;

public class DependencyInjection {

	public static void main(String[] args) {
		 try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class))
		 {
			  ServiceCenter serviceCenter = ctx.getBean(ServiceCenter.class);
			  serviceCenter.displayService();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }

	}

}
