package com.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.controller.ProductController;
import com.nit.model.Product;
@Component
public class ProductRunner implements CommandLineRunner{
	@Autowired
	private ProductController controller;
	@Override
	public void run(String... args) throws Exception {
		String saveProduct = controller.saveProduct(new Product(222,"raj",120.0,4));
		System.out.println(saveProduct);
		
	}

}
