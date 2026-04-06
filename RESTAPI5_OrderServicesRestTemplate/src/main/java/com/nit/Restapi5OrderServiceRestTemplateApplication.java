package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Restapi5OrderServiceRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(Restapi5OrderServiceRestTemplateApplication.class, args);
	}
	@Bean
	public RestTemplate currentRestTemplate()
	{
		return new RestTemplate();
	}

}
