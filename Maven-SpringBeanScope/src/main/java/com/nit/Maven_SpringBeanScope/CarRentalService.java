package com.nit.Maven_SpringBeanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("car")
@Scope("prototype")
public class CarRentalService implements VehicleService {

	@Override
	public void rent(String customer) {
     System.out.println("Renting Car to "+customer );
	}

}
