package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.GreetingScheduler;

public class DependencyInjection {

	public static void main(String[] args) {
		//Create IOC container
      FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("C:\\Users\\gaynu\\OneDrive\\Desktop\\Spring\\IOCProject1d\\src\\com\\nit\\cfgs\\ApplicationContext.xml");
      //get target bean class object using IOC
      GreetingScheduler greetingscheduler = ctx.getBean("gs",GreetingScheduler.class);
      String greeting = greetingscheduler.Greeting();
      System.out.println(greeting);
      ctx.close();
	}

}
