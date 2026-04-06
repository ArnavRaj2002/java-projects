package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.DiscountService;

public class DependencyContainer {

	public static void main(String[] args) {
		try( ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("com\\nit\\cfgs\\applicationContext.xml")){
		 DiscountService discountService = ctx.getBean("ds",DiscountService.class);
		 discountService.setDiscountPercentage(10);
		 discountService.calculateFinalPrice();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
