package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.sbeans.NotificationManager;
import com.nit.test.AppConfig;

public class DependencyInjection {

	public static void main(String[] args) {
     try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class))
     {
    	 NotificationManager notificationManager = ctx.getBean(NotificationManager.class);
    	 notificationManager.displayDetails("Hii i am ARNAV");
     }
     catch(Exception e) {
    	 e.printStackTrace();
     }
	}

}
