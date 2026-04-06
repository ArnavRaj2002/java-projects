package com.nit.sbeans;

import org.springframework.stereotype.Service;

@Service("en")
public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("Email Notification: "+message);
	}

}
