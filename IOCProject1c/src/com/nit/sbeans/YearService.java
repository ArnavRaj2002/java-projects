package com.nit.sbeans;

import java.time.LocalDate;

public class YearService 
{
 private LocalDate date;
 public YearService () {
	 System.out.println("YearService.YearService()");
 }
 public void setDate(LocalDate date) {
	 this.date=date;
 }
 public String getMonth() {
	 if((date.getMonth().name()).equalsIgnoreCase("januaRY"))
		 return "Happy New Year!";
	 else if(date.getMonth().name().equalsIgnoreCase("December"))
		 return "Get ready for the new year!";
	 return "Regular month.";
 }
}
