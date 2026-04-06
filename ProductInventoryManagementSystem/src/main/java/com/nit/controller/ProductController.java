package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.model.Product;
import com.nit.service.ProductService;   

 @Controller
public class ProductController {
    @Autowired
    private ProductService service;    

    public boolean getListOfProductByID(int id) {
     
    	return service.getListOfProductByID(id);
    }

    public String IncreaseStock(int qty,int id)  {
    	return  service.increaseStock(qty,id);
    }   

    public String decreaseStock(int qty,int id) {
         return service.decreaseStock(qty,id);
        
    }
    public List<Product> productBelowThreshold(int qty) 
    {
    	return service.productBelowThreshold(qty);
    }
}
