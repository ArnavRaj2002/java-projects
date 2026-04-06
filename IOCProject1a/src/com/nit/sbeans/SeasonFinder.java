package com.nit.sbeans;

import java.time.LocalDate;
//import java.time.LocalTime;

public class SeasonFinder {

	//private LocalTime time;
	private LocalDate date; //HAS-A
	
	public SeasonFinder() {
		System.out.println("SeasonFinder.SeasonFinder()");
		
		 
	}
	
	public void setDate(LocalDate date) {
	System.out.println("SeasonFinder.setDate()");
		this.date=date;
	}
	public String showSeasonWithMessage(String name) {
		int monthValue = date.getMonthValue();
		if(monthValue==3 && monthValue<=5) return "Summer Season "+name;
		else if(monthValue>=6 && monthValue<=8) return "Rainy Season "+name;
		else return "Winter Season "+name;
		  
	}
}
