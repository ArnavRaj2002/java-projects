package com.nit;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling
@SpringBootApplication
public class SbScheduling2Application {

	public static void main(String[] args) {
		SpringApplication.run(SbScheduling2Application.class, args);
		//System.out.println("MAIN Thread :: " + Thread.currentThread().getName());

		System.out.println("\nApp Starts @ :: "+LocalDateTime.now());

	}

}
