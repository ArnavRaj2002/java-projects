package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
	@Autowired
	@Qualifier("pn")
   private NotificationService service;
   
   public void displayInfo()
   {
         service.sendNotification("Hii !!  I am ARNAV");
   }
}
