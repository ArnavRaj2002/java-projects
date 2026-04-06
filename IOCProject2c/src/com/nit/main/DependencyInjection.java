package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.Company;

public class DependencyInjection {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("C:\\Users\\gaynu\\OneDrive\\Desktop\\Spring\\IOCProject2c\\src\\com\\nit\\cfgs\\ApplicationContext.xml");
		Company company = ctx.getBean("comp",Company.class);
        company.showDepartments();
        ctx.close();
	}

}
