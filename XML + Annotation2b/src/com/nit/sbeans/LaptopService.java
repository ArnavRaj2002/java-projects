package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ls")
public class LaptopService {
	@Autowired
	private Laptop laptop;

	public void printLaptopDetails() {
		System.out.println("Laptop Brand: " + laptop.getBrand());
		System.out.println("Processor: " + laptop.getProcessor());
		System.out.println("RAM: " + laptop.getRam());

	}
}
