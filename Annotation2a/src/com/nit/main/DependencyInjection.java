package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;
import com.nit.sbeans.PaymentProcessor;

public class DependencyInjection {

	public static void main(String[] args) {
		 try(AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class))
		 {
			 PaymentProcessor paymentProcessor = ctx.getBean(PaymentProcessor.class);
			 paymentProcessor.displayPaymentDetails(150);
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
