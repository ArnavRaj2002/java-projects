package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.nit.sbeans.ReportCardService;

public class DependencyInjection {

	public static void main(String[] args) {
		 try(ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\nit\\cfgs\\applicationContext.xml"))
		 {
		 ReportCardService reportCardService = ctx.getBean("rcs",ReportCardService.class);
          reportCardService.ReportCard();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}
	

}
