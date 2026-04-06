package com.nit.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("sf")
public class SeasonFinder {
	@Autowired
  private LocalDate localdate;
  private	String currentSeason;
  
  
  public void setLocaldate(LocalDate localdate) {
	this.localdate = localdate;
}

//public void setCurrentSeason(String currentSeason) {
//	this.currentSeason = currentSeason;
//}

public String findSeason() {
	  if(localdate.getMonthValue()>=3 && localdate.getMonthValue()<=5)
		  return "Summer Season";
	  else if(localdate.getMonthValue()>=6 && localdate.getMonthValue()<=8)
		  return "Rainy Season";
	return "Winter Season";
  }
  
  public void printSeason() {
	  currentSeason = findSeason();
	  System.out.println("CurrentSeason is:- "+currentSeason);
}}
