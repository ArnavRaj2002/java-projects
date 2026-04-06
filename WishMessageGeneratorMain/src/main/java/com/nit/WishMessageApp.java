package com.nit;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.sbeans.WishMessageGenerator;
@SpringBootApplication
public class WishMessageApp {
	
	@Bean
	public LocalDateTime dateTime()
	{
		return LocalDateTime.now();
	}
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(WishMessageApp.class, args))
		{
			 WishMessageGenerator messageGenerator = ctx.getBean(WishMessageGenerator.class);
			String messagePrint = messageGenerator.wishAlert("Good");
			System.out.println(messagePrint);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
