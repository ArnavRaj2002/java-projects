package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.model.Product;
import com.nit.service.ProductService;
@Controller
public class ProductController {
	@Autowired
	private ProductService service;

	public String saveProduct(Product p) {
		return service.saveProduct(p);
	}
}
