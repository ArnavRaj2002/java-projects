package com.nit.Maven_TransportBookingSystem_SingleTonScope;

import org.springframework.stereotype.Component;

@Component("bus")
public class BusTransportService implements TransportService {

	public BusTransportService() {
		super();
		System.out.println("BusTransportService::0 arg const");
	}

	@Override
	public void book(String source, String destination) {
 System.out.println("Booking Bus from "+source+" to "+destination);
	}

}
