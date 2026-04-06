package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class Ms1DiscoveryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms1DiscoveryClientApplication.class, args);
		System.out.println("Appointment Service Started");
	}

}
