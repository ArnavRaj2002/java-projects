package com.nit.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nit.dao.ProductDAO;
import com.nit.model.Product;

@Service
public class ProductService {    
    @Autowired
    private ProductDAO dao;

    public boolean getListOfProductByID(int id) {
    	return dao.getListOfProductByID(id);
    }

    public String increaseStock(int qty,int id)  {
    	return  dao.increaseStock(qty,id);
    }   

    public String decreaseStock(int qty,int id) {
         return dao.decreaseStock(qty,id);
        
    }
    public List<Product> productBelowThreshold(int qty) 
    {
    	return dao.productBelowThreshold(qty);
    }
}
