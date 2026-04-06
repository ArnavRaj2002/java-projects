package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class Ms3ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms3ProductServiceApplication.class, args);
	}

}
