package com.nit.sbeans;

import org.springframework.stereotype.Service;

@Service("sn")
public class SmsNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("Sms Notification: "+message);
		
	}

}
