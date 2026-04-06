package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.EmailScheduler;

public class DependencyInjection {

	public static void main(String[] args) {
		//creating IOC container
		 FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("C:\\Users\\gaynu\\OneDrive\\Desktop\\Spring\\IOCProject1e\\src\\com\\nit\\cfgs\\ApplicationContext.xml");
		 //get target bean class object using IOC
		 EmailScheduler emailscheduler=ctx.getBean("es",EmailScheduler.class);
		 String outputMsg = emailscheduler.getDay();
		 System.out.println(outputMsg);
         ctx.close();
	}

}
