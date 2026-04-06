package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TravelAgency {
private TravelBookingService service;
@Autowired
@Qualifier("trainBooking")
public void setService(TravelBookingService service) {
	this.service = service;
}
public void printInfo(String destination) {
	service.bookTicket(destination);
}
}
