package com.nit.sbeans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NotificationService {
	
	Map<String,NotificationStrategy> map=new HashMap<String, NotificationStrategy>();
	//@Autowired
	public NotificationService(Map<String, NotificationStrategy> map) {
		super();
		this.map = map;
	}

	void sendNotification(String type, String message)
	{  
			NotificationStrategy notificationStrategy = map.get(type);
			 double send = notificationStrategy.send(message);
		     System.out.println("cost : "+send);
	}

	
}
