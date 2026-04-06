package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("busBooking")

public class BusBookingService implements TravelBookingService{

	@Override
	public void bookTicket(String destination) {
		 System.out.println("Booking bus ticket to "+destination);	
	}

}
