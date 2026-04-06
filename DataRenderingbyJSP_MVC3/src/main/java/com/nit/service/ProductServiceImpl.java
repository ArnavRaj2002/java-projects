package com.nit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nit.model.Product;

@Service
public class ProductServiceImpl implements IProductService {
	// List<Product> listOfProducts = new ArrayList<Product>();
	// listOfProducts.add(new Product(101, "Laptop", 50000d, "Electronics"));
//This is a statement, and statements are NOT allowed at class level. ??

	List<Product> listOfProducts = List.of(new Product(101, "Laptop", 50000d, "Electronics"),
			new Product(102, "Phone", 20000d, "H/w"), new Product(103, "computer", 25000d, "H/w"),
			new Product(104, "Monitor", 30000d, "s/w"));

	@Override
	public List<Product> getAllProducts() {
		return new ArrayList<Product>(listOfProducts);
	}

	@Override
	public Optional<Product> getProductById(Integer id) {
		Optional<Product> firstProduct = listOfProducts.stream().filter(p -> p.getId().equals(id)).findFirst();
		return firstProduct;
	}

	@Override
	// featured defined as price > 500
	public List<Product> getFeaturedProducts() {
 //List<Product> list = listOfProducts.stream().filter(p->p.getPrice()!=null && p.getPrice()>500).toList();
 //.toList() returns an unmodifiable list (cannot add or remove elements).
List<Product> list = listOfProducts.stream().filter(p->p.getPrice()!=null && p.getPrice()>500).collect(Collectors.toList());
 //Returns a mutable list → safe to modify later:
		return list;
	}

}
