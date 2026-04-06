package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("debit")
public class DebitCardPayment implements PaymentStrategy {
	@Value("${payment.debit.base}")	
	int base;
	@Value("${payment.debit.percentage}")	
	double percentage;
	@Override
	public double calculateFee(double amount) {
		System.out.println("Debit Card Fee: " + amount);
		return base+(amount*percentage)/100;
	}

}
