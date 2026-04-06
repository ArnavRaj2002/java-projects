package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppCOnfig;
import com.nit.sbeans.NotificationManager;

public class DependencyInjection {

	public static void main(String[] args) {
		 try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppCOnfig.class)){
			   NotificationManager notificationManager = ctx.getBean(NotificationManager.class);
			   notificationManager.displayInfo();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
