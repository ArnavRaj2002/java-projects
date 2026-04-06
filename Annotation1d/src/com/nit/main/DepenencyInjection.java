package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.configs.AppConfig;
import com.nit.sbeans.Company;

public class DepenencyInjection {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class)){
			Company company = ctx.getBean(Company.class);
			company.displayCompanyInfo();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
