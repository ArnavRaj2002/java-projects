package com.nit.cfgs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nit.sbeans")
public class AppConfig 
{
  public AppConfig() {
	  System.out.println("AppConfig.0 arg Constructor");
  }
  
  @Bean(name="ldate")
  public LocalDate getDate() {
	  System.out.println("AppConfig.getDate()");
	  return LocalDate.now();
  }
  
  @Bean(name="ltime")
  public LocalTime getTime() {
	  System.out.println("AppConfig.getTime()");
	  return LocalTime.now();
  }
  
  @Bean(name="ldatetime")
  public LocalDateTime getDateTime() {
	  System.out.println("AppConfig.getDateTime()");
	  return LocalDateTime.now();
  }
}
