package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nit.dao.ProductRepository;
import com.nit.model.Product;
@Service
public class ProductService implements IProductService {
@Autowired
	private ProductRepository repo;
	@Override
	public String saveProduct(Product p) {
 		return repo.saveProduct(p) ;
	}

	@Override
	public String updateProduct(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
