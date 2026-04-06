package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("paypalPayment")
public class PaypalPaymentService implements PaymentService
{

	@Override
	public void pay(double amount) {
		 System.out.println("Paid "+amount+" using PayPal");
		
	}

	
}
