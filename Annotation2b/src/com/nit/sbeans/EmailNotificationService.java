package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailNotificationService  implements NotificationService{

	@Override
	public void send(String message) {
		 System.out.println("Sending Email: "+message);
		
	}

}
