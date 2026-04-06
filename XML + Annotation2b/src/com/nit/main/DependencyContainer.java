package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.LaptopService;

public class DependencyContainer {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com\\nit\\cfgs\\applicationContext.xml")) {
			LaptopService laptopService = ctx.getBean("ls", LaptopService.class);
			laptopService.printLaptopDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
