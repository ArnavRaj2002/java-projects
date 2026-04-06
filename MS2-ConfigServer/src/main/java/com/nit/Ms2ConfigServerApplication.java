package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class Ms2ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms2ConfigServerApplication.class, args);
	}

}
