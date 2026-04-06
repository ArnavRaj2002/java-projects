package com.nit.sbeans;

import java.time.LocalDate;

public class CalendarService {

	private LocalDate date;
	
	public CalendarService() {
		System.out.println("CalendarService.CalendarService()");
	}
	public void setDate(LocalDate date) {
		this.date=date;
	}
	public String calenderServiceOutput() {
		if(date.getDayOfMonth()==30 || date.getDayOfMonth()==31) {
			System.out.println("Month is ending, please submit reports.");
		}
		 System.out.println("Continue working as usual.");
		return null;
	}
}

