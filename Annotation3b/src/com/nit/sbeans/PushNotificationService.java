package com.nit.sbeans;

import org.springframework.stereotype.Service;

@Service("pn")
public class PushNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		 
		System.out.println("Push Notification : "+ message);
	}
 
}
