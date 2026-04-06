package com.nit.Maven_TransportBookingSystem_SingleTonScope;

import org.springframework.stereotype.Component;

@Component("train")
public class TrainTransportService implements TransportService {

	public TrainTransportService() {
		super();
		System.out.println("TrainTransportService::0 arg const");
	}

	@Override
	public void book(String source, String destination) {
		 System.out.println("Booking Train from "+source+" to "+destination);

	}

}
