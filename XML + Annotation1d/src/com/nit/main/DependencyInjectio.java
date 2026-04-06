package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.TimePrinter;

public class DependencyInjectio {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com\\nit\\cfgs\\applicationContext.xml")) {
			TimePrinter timePrinter = ctx.getBean("tp", TimePrinter.class);
			timePrinter.printTime();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
