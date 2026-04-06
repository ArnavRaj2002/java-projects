package com.nit.Maven_SpringBeanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bike")
 //@Scope("singleton")
 
public class BikeRentalService implements VehicleService {

	@Override
	public void rent(String customer) {
	     System.out.println("Renting Bike to "+customer);

	}

}
