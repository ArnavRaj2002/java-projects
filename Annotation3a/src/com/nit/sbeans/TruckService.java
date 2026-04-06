package com.nit.sbeans;

import org.springframework.stereotype.Service;

@Service("ts")
public class TruckService implements VehicleService {

	@Override
	public void performService() {
		System.out.println("TruckService");
	}

}
