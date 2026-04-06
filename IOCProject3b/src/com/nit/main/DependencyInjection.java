package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.Customer;

public class DependencyInjection {

	public static void main(String[] args) {
		//creating IOC container
	FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("C:\\Users\\gaynu\\OneDrive\\Desktop\\Spring\\IOCProject3b\\src\\com\\nit\\cfgs\\ApplicationContext.xml");
	//get target spring bean class reference
	Customer customer = ctx.getBean("cust",Customer.class);
     String displayCustomerDetails = customer.displayCustomerDetails();
     System.out.println(displayCustomerDetails);
     ctx.close();
	}

}
