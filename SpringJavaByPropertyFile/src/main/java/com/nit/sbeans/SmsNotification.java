package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("sms")
public class SmsNotification implements NotificationStrategy {

	 
	@Value("${notification.sms.cost}")
	private double cost;
		@Override
		public double send(String message) {
			System.out.println("Sending SMS: "+message);
			
	 		return cost;
		}
}
