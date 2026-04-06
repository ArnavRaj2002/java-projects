package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class Ms1DiscoveryClientDoctorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms1DiscoveryClientDoctorServiceApplication.class, args);
		System.out.println("Doctor Service Discovered");
	}

}
