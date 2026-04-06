package com.nit.sbeans;

import java.time.LocalDate;

public class EmailScheduler 
{
  private LocalDate date;
  
  public EmailScheduler() {
	  System.out.println("EmailScheduler.EmailScheduler()");
  }
  public void setDate(LocalDate date) {
	  this.date=date;
  }
  public String getDay() {
	  if(date.getDayOfWeek().equals("Friday"))
		  return "Schedule weekly report email.";
	  else if(date.getDayOfWeek().equals("Monday"))
		   return "Check weekend system logs.";
	  return "Normal weekday operations.";
  }
}
