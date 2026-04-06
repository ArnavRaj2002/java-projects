package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.CalendarService;

public class DependencyInjection {

	public static void main(String[] args) {
		 //IOC container created
		 FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("C:\\Users\\gaynu\\OneDrive\\Desktop\\Spring\\IOCProject1b\\src\\com\\nit\\cfgs\\ApplicationContext.xml");
		 //get target bean class object from IOC container
		 CalendarService calendarservice = ctx.getBean("cs",CalendarService.class);
		 calendarservice.calenderServiceOutput();    
		 ctx.close();
	}

}
