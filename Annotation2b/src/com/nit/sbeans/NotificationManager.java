package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {
private NotificationService service;
@Autowired
@Qualifier("smsService")
public void setService(NotificationService service) {
	this.service = service;
}
public void displayDetails(String msg) {
	service.send(msg);
}

}
