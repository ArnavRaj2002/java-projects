package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class ServiceCenter {
	 @Autowired
	    @Qualifier("cs")
	private VehicleService service;
   
	public void displayService()
	{
		System.out.print("Service is ");
	    service.performService();

	}
}
