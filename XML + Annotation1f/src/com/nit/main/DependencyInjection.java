package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.AgeCalculator;

public class DependencyInjection {

	public static void main(String[] args) {
		 try(ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\nit\\cfgs\\applicationContext.xml")){
			 AgeCalculator ageCalculator = ctx.getBean("ac",AgeCalculator.class);
			 ageCalculator.calculateAge();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }

	}

}
