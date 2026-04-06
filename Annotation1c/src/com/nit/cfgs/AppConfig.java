package com.nit.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages ="com.nit.sbeans")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig.0 arg constructor");
	}
//	@Bean("add")
//	public Address getAddressDetails() {
//		Address address=new Address();
//		address.setCity("Patna");
//		address.setState("Bihar");
//		return address;
//	}
	
//	@Bean("std")
//	public Student getStudentDetails() {
//		Student student =new Student();
//		student.setName("Arnav");
//		student.setAddress(getAddressDetails());
//		return student;
//	}
}
