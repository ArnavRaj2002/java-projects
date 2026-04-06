package com.nit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.model.Product;
import com.nit.service.IProductService;


@Controller
public class ProductController {
	@Autowired
	private IProductService productService;
	
	 @RequestMapping("/products")
	 public String produtList(Model model)
	 {
		 List<Product> allProducts = productService.getAllProducts();
		 model.addAttribute("productList", allProducts);
		return "products.jsp";
		 
	 }
	 @RequestMapping("/product/{id}")
	public String findById(@PathVariable("id") Integer id,Model model)
	{
		 Optional<Product> productById = productService.getProductById(id);
		 if(productById.isPresent())
		 {
			 model.addAttribute("prodbyId", productById);
		 }
		 else {
			 model.addAttribute("ProdIdnotFound","product ID "+id+"::is doesn't exist !!");
		 }
		return "productDetails.jsp";
		
	}
	 @RequestMapping("/featured")
	public String fetchFeaturedProducts(Model model)
	{
		 List<Product> featuredProducts = productService.getFeaturedProducts();
		 model.addAttribute("featuredProdList", featuredProducts);
		return "featured.jsp";
		
	}
	 @RequestMapping("/greeting")
	 public String greetingMessage(Model model)
	 {
		 model.addAttribute("msg", "Hii!! List Fetched Sucessfully !!");
		 return "greeting.jsp";
	 }

}
