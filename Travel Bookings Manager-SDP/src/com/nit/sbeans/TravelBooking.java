package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TravelBooking {
	@Autowired
	@Qualifier("flight")
	private  Transportation transportation;
	public void setTransportation(Transportation transportation)
	{
		this.transportation=transportation;
	}
	public void executeBooking(String destination, double price)
	{
		transportation.bookTrip(destination, price);
	}
}
