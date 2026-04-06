package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.Maven_TransportBookingSystem_SingleTonScope.BookingManager;
import com.nit.cfgs.AppConfig;

public class TravelManagementApp {

	public static void main(String[] args) {
		System.out.println("step 1");
 try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class))
 {
	 System.out.println("step 2");
	 BookingManager bookingManager1 = ctx.getBean(BookingManager.class);//get bean obj ref
	 bookingManager1.bookTicket("Hyderabad", "Secunderabad");
	 System.out.println("hashcode1 :: "+bookingManager1.hashCode());
//	 BookingManager bookingManager2 = ctx.getBean(BookingManager.class);
//	 bookingManager2.bookTicket("Mumbai", "Pune");
//	 System.out.println("hashcode2 :: "+bookingManager2.hashCode());
//	 
 }
	}

}
