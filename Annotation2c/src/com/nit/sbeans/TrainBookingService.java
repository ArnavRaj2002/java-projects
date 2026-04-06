package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("trainBooking")

public class TrainBookingService implements TravelBookingService{

	@Override
	public void bookTicket(String destination) {
		 System.out.println("Booking train ticket to "+destination);
		
	}

}
