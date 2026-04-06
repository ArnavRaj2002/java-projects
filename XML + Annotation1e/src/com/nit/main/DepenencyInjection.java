package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.SeasonFinder;

public class DepenencyInjection {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\nit\\cfgs\\applicationContext.xml")){
			 SeasonFinder seasonFinder = ctx.getBean("sf",SeasonFinder.class);
			 seasonFinder.printSeason();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
