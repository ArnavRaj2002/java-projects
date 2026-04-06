package com.nit.sbeans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CartService {
	@Autowired
	private Product product;

	List<Product> listOfItems = new ArrayList<Product>();

	public void addProduct(Product product) {
		listOfItems.add(product);
	}

	public double calculateTotal(double discountPercentage)
	{
		double newAmount=(product.getPrice()-(product.getPrice()*discountPercentage));
		return newAmount;
	}
}
