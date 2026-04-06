package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
 AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
 ProductService productService = ctx.getBean(ProductService.class);
 productService.addUser("Arnav", "Laptop");
 productService.getUser("Arnav");
 System.out.println("======================================");
 OrderService orderService = ctx.getBean(OrderService.class);
 //orderService.addUser("Arnav", "Laptop");
 orderService.getUser("Arnav");
 ctx.close();
	}

}
