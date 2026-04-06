package com.nit.Maven_TransportBookingSystem_SingleTonScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
 public class BookingManager {
	@Autowired
	@Qualifier("flight")
	TransportService transportService;
	//One constructor present → @Autowired optional (Spring auto-wires).
	public BookingManager( ) {
		super();
		//this.transportService = transportService;
		System.out.println("BookingManager::0 arg const");
	}

	public void bookTicket(String src, String dest)
	{
		System.out.println("Welcome");
		transportService.book(src, dest);
		System.out.println("Welcome Again");
		
	}
}
