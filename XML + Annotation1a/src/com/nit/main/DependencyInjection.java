package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.WelcomeService;
 

public class DependencyInjection {

	public static void main(String[] args) {
		try( ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\nit\\cfgs\\applicationContext.xml")){
			 WelcomeService welcomeService = ctx.getBean("ws",WelcomeService.class);
			 System.out.println(welcomeService.message());
		}
		 catch(Exception e) {
			 e.printStackTrace();
		 }

	}

}
