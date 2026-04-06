package com.nit.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class Product {
private int id;
private String name;
private double price;
private int quantity;

//public Product(int id, String name, double price, int quantity) {
//	super();
//	this.id = id;
//	this.name = name;
//	this.price = price;
//	this.quantity = quantity;
//}


}
 