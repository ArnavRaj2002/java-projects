package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("credit")
public class CreditCardPayment implements PaymentStrategy {
	@Value("${payment.credit.base}")	
	int base;
	@Value("${payment.credit.percentage}")	
	double percentage;
	@Override
	public double calculateFee(double amount) {
		System.out.println("Amount: " + amount);
		System.out.println("Credit Card Fee: " + amount);
		return base+(amount*percentage)/100;
	}

}
