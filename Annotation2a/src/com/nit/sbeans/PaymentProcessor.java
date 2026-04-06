package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class PaymentProcessor {
private PaymentService service;
@Autowired
@Qualifier("paypalPayment")
public void setService(PaymentService service) {
	this.service = service;
}
public void displayPaymentDetails(double amnt) {
	service.pay(amnt);
}

}
