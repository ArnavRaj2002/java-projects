package com.nit.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("tp")
public class TimePrinter {
@Autowired
private LocalTime currentTime;

public   TimePrinter() {
	System.out.println("TimePrinter.0 args const"); 
}
public void setCurrentTime(LocalTime currentTime) {//?? why this required we are using field injecton then why setter??
	this.currentTime = currentTime;
}


public void printTime() {
	System.out.println("Current Time is:-");
	System.out.println("Hours :"+ currentTime.getHour());
	System.out.println("Minutes :"+ currentTime.getMinute());
	System.out.println("Seconds :"+ currentTime.getSecond());
}
}
