package com.nit;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SbSchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbSchedulingApplication.class, args);
		System.out.println("\nApp Started @ "+LocalDateTime.now());
	}

}
