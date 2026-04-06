package com.nit.sbeans;

import java.time.LocalTime;

public class GreetingScheduler {
 private LocalTime time;
 public GreetingScheduler() {
	 System.out.println("GreetingScheduler.GreetingScheduler()");
 }
 public void setTime(LocalTime time) {
	 this.time=time;
 }
 public String Greeting() {
	 if(time.getHour()>=5 && time.getHour()<=11)
		 return "Good Morning";
	 else if(time.getHour()>=12 && time.getHour()<=16)
		 return "Good Afternoon";
	 else if(time.getHour()>=17 && time.getHour()<=20)
		 return "Good Evening";
	 return "Good Night";
 }
}
