package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsNotificationService implements NotificationService {
  public void send(String message) {
	System.out.println("Sending SMS: "+message);
}
}
