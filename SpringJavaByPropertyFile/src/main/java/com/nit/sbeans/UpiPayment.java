package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("upi")
public class UpiPayment implements PaymentStrategy {
@Value("${payment.upi.base}")	
int base;
@Value("${payment.upi.percentage}")	
double percentage;
	@Override
	public double calculateFee(double amount) {
	
		System.out.println("UPI Fee: " + amount);
		return base+(amount*percentage)/100;
	}

}
