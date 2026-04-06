package com.nit.Maven_SpringBeanScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "com.nit.Maven_SpringBeanScope")
public class Main {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Main.class);
RentalManager rentalManager1 = ctx.getBean(RentalManager.class);
rentalManager1.rent("ARNAV !!");
System.out.println(rentalManager1.hashCode());;
System.out.println("================================");
RentalManager rentalManager2 = ctx.getBean(RentalManager.class);
rentalManager2.rent("RAj !!");
System.out.println(rentalManager2.hashCode());;
}
}
