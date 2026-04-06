package com.nit.sbeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;

public class BankTester {
 public static void main(String[] args) {
	try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class)) 
	{
		ConcreteBankFactory concreteBankFactory = ctx.getBean(ConcreteBankFactory.class);
		Bank bank = concreteBankFactory.createBank("hdfC");
		// ===============vs=============================
//		ConcreteBankFactory cf=new ConcreteBankFactory();
//		Bank bank2 = cf.createBank("sbi");
		
		Customer customer = ctx.getBean(Customer.class);
		customer.setCustomerName("RAJ");
		customer.setCustomerId(215);
 		customer.setBank(bank); //
		customer.deposit(500);
		customer.withdraw(400);
		String displayDetails = customer.displayDetails();
		System.out.println(displayDetails);
	} 
	catch (Exception e) 
	{
		 
	}
}
}
