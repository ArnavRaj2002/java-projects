package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
 

import com.nit.sbeans.SalarySlipService;

public class DependencyInject {

	public static void main(String[] args) {
		try(  ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\nit\\cfgs\\applicationContext.xml")){
			SalarySlipService salarySlipService = ctx.getBean("ss",SalarySlipService.class);
			salarySlipService.generateSlip();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
