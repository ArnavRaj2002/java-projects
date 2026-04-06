package com.nit.sbeans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wda")
public class WeekDayAnalyzer 
{
	
 private LocalTime ltime;
 private LocalDate ldate;
 private LocalDateTime ldtime;
 
 @Autowired
 public WeekDayAnalyzer(LocalDateTime ldtime,LocalTime ltime, LocalDate ldate) {
	super();
	System.out.println("WeekDayAnalyzer.3 arg Constructor");
	this.ltime = ltime;
	this.ldate = ldate;
	this.ldtime = ldtime;
}
 public WeekDayAnalyzer() {
		System.out.println("WeekDayAnalyzer.0 arg Constructor");
 
 }

@Override
public String toString() {
	return "WeekDayAnalyzer [ltime=" + ltime + ", ldate=" + ldate + ", ldtime=" + ldtime + "]";
}
 
 
}
