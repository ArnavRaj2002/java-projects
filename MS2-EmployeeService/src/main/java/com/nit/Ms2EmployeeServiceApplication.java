package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class Ms2EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms2EmployeeServiceApplication.class, args);
	}

}
