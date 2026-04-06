package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.OfficeBuilding;

@SpringBootApplication
public class OfficeBuildingAutomationConfigurationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(OfficeBuildingAutomationConfigurationApplication.class, args);
		OfficeBuilding officeBuildingInfo = ctx.getBean(OfficeBuilding.class);
		System.out.println(officeBuildingInfo);
	}

}
