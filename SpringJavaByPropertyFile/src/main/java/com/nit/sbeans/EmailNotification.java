package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("email")
public class EmailNotification implements NotificationStrategy {
@Value("${notification.email.cost}")
private double cost;
	@Override
	public double send(String message) {
		System.out.println("Sending Email: "+message);
		
 		return cost;
	}

}
