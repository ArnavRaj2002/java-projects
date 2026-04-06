package com.nit.sbeans;

public class Order {
private String orderId;
private int quantity;
private Product product; //HAS-A
private Customer customer;//HAS-A

public Order() {
	System.out.println("Order.Order()");
	
}

public String getOrderId() {
	return orderId;
}

public void setOrderId(String orderId) {
	this.orderId = orderId;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

@Override
public String toString() {
	return "Order [orderId=" + orderId + ", quantity=" + quantity + ", product=" + product + ", customer=" + customer
			+ "]";
}

}
