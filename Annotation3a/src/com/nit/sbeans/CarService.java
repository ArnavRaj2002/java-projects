package com.nit.sbeans;

import org.springframework.stereotype.Service;

@Service("cs")
public class CarService implements VehicleService {

	@Override
	public void performService() {
		System.out.println("CarService");
	}

}
