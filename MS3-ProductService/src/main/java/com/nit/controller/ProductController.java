package com.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.Product;

@RestController
@RequestMapping("/product")
public class ProductController {
	@GetMapping("/display")
public String displayMsg()
{
	Product p=new Product("item@123","Biscuit");
	return "Product Details := "+p;
}
}
