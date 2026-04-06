package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("noti")
public class PushNotification implements NotificationStrategy {
     @Value("${notification.push.cost}")
	private double cost;
	@Override
	public double send(String message) {
		System.out.println("Sending Push: "+message);

 		return cost;
	}

}
