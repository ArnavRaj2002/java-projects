package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nit.model.Product;

@Service
public interface IProductService {
	public List<Product> getAllProducts();
	public Optional<Product> getProductById(Integer id);
	public List<Product> getFeaturedProducts();
}
