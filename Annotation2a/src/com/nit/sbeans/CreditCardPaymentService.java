package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("creditCardPayment")
public class CreditCardPaymentService implements PaymentService {

	@Override
	public void pay(double amount) {
		 System.out.println("Paid "+amount+" using PayPal");
		
	}

}
