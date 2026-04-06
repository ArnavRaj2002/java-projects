package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class Ms00EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms00EurekaServerApplication.class, args);
	}

}
