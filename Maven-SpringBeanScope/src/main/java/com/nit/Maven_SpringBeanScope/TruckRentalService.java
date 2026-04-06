package com.nit.Maven_SpringBeanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("truck")
@Scope("singleton")
public class TruckRentalService implements VehicleService {

	@Override
	public void rent(String customer) {
	     System.out.println("Renting Truck to "+customer );

	}

}
