package com.nit.sbeans;

import org.springframework.stereotype.Service;

@Service("bs")
public class BikeService implements VehicleService {

	@Override
	public void performService() {
 		System.out.println("BikeService");
	}

}
