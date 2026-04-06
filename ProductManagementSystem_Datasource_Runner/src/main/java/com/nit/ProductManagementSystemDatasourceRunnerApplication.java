package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProductManagementSystemDatasourceRunnerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ProductManagementSystemDatasourceRunnerApplication.class, args);
	}

}
