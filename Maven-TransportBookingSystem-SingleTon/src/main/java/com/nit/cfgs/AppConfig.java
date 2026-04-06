package com.nit.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nit.Maven_TransportBookingSystem_SingleTonScope")
public class AppConfig {
	 
	AppConfig()
	{
		System.out.println("AppConfig::0 args const");
	}

}
