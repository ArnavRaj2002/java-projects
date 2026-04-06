package com.nit.sbeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
@PropertySource(value="com\\common\\spring\\payment.properties")
public class MainPaymentApp {

	public static void main(String[] args) {
		 AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MainPaymentApp.class);
		 PaymentService paymentService = ctx.getBean(PaymentService.class);
         paymentService.getPaymentFee("credit",1000.0);
         ctx.close();
	}

}
