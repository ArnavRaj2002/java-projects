package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ds")
public class DiscountService {
@Autowired //??
private	Product product;
private	double discountPercentage;
//public DiscountService(Product product, double discountPercentage) {           //??
//	super();
//	this.product = product;
//	this.discountPercentage = discountPercentage;
//} 
public void setProduct(Product product) {
	this.product = product;
}

public void setDiscountPercentage(double discountPercentage) {
	this.discountPercentage = discountPercentage;
}

public void calculateFinalPrice()
{
	double discountAmount = (product.getPrice() * discountPercentage) / 100;

	System.out.println("Product: "+product.getName());
	System.out.println("Original Price: "+product.getPrice());
	System.out.println("Discount: "+discountPercentage);
	System.out.println("Final Price: "+(product.getPrice()-discountAmount));
}




}
