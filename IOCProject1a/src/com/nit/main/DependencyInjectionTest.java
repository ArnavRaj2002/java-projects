package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		// Create IOC Container
		//FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("C:\\Users\\gaynu\\OneDrive\\Desktop\\Spring\\IOCProject1a\\src\\com\\nit\\cfgs\\applicationContext.xml");
		//get target bean class object from IOC container                          
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("C:\\All@Coding\\JAVA\\Spring\\IOCProject1a\\src\\com\\nit\\cfgs\\applicationContext.xml");

		SeasonFinder seasonfinder = ctx.getBean("sfind",SeasonFinder.class);
//		Object obj = ctx.getBean("sfind");
//		SeasonFinder season=(SeasonFinder)obj;
		String result=seasonfinder.showSeasonWithMessage("is Currently going on :} ");
		System.out.println("SEASON:- "+result);
		ctx.close();

	}

	
}
