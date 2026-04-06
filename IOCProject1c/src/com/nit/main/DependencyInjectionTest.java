package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.YearService;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//cretae IOC container
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("C:\\Users\\gaynu\\OneDrive\\Desktop\\Spring\\IOCProject1c\\src\\com\\nit\\cfgs\\ApplicationContext.xml");
		 //get target bean class object from IOC
		YearService yearservice=ctx.getBean("ys",YearService.class);
		String month = yearservice.getMonth();
		System.out.println(month);
		ctx.close();
		}

}
