package com.nit.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class PaymentService {
//private PaymentStrategy service;
	
Map<String, PaymentStrategy> map;

 @Autowired
public PaymentService(Map<String, PaymentStrategy> map) {
	super();
	this.map = map;
}


void getPaymentFee(String type, double amount)
{
	PaymentStrategy paymentStrategy = map.get(type);
	double calculateFee = paymentStrategy.calculateFee(amount);
	System.out.println(calculateFee);
}

}
