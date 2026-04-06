package com.nit.Maven_TransportBookingSystem_SingleTonScope;

import org.springframework.stereotype.Component;

@Component("flight")
public class FlightTransportService implements TransportService {

	
	public FlightTransportService() {
		super();
		System.out.println("FlightTransportService::0 args const");
		
	}

	@Override
	public void book(String source, String destination) {
		 System.out.println("Booking Flight from "+source+" to "+destination);

	}

}
