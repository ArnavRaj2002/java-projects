package com.nit.sbeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
@PropertySource(value="com\\common\\spring\\notification.properties")
public class MainNotificationApp {

	public static void main(String[] args) {
 AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MainNotificationApp.class);
 NotificationService notificationService = ctx.getBean(NotificationService.class);
 System.out.println("============"+ctx.hashCode()+"==========");
 notificationService.sendNotification("email", "Order Shipped");
 notificationService.sendNotification("sms", "Order Shipped");
 notificationService.sendNotification("noti", "Order Shipped");
System.out.println("============"+notificationService.hashCode()+"==========");

NotificationService notificationService1 = ctx.getBean(NotificationService.class);
System.out.println("============"+ctx.hashCode()+"==========");
notificationService1.sendNotification("email", "Order Shipped");
notificationService1.sendNotification("sms", "Order Shipped");
notificationService1.sendNotification("noti", "Order Shipped");
System.out.println("============"+notificationService1.hashCode()+"==========");
ctx.close();
	}

}
