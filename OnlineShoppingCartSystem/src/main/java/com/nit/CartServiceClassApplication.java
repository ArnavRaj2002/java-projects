package com.nit;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.sbeans.CartService;
import com.nit.sbeans.Product;

@SpringBootApplication
public class CartServiceClassApplication {

    
	static Scanner sc=new Scanner(System.in);

     
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CartServiceClassApplication.class, args);
		 Product product = ctx.getBean(Product.class);
		 System.out.println(product);
		 System.out.println("Enter  discount:");
		 Double discount=Double.parseDouble(sc.nextLine());	
          CartService service = ctx.getBean(CartService.class);
          service.calculateTotal(discount);
	}
	@Bean
public Product getProduct()
{
	
	 System.out.println("Enter  products to add:");
	 String name=sc.nextLine();
	 System.out.println("Enter  price:");
	 Double price=Double.parseDouble(sc.nextLine());
	
	 Product pro=new Product(name, price);
	 return pro;
}
}
