package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class Eurekaser100Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaser100Application.class, args);
	}

}
