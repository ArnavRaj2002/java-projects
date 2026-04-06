package com.nit.sbeans;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("ac")
public class AgeCalculator {
private int  age;
@Autowired//inject by other class not by this class??
private LocalDate localdate;

 
public void setLocaldate(LocalDate localdate) {
	this.localdate = localdate;
}

 

public void calculateAge() {
	LocalDate today = LocalDate.now();
    age = Period.between(localdate, today).getYears();//??how localdate take values
	 System.out.println("Age is:- "+age);

}
public void printAge() {
	calculateAge();
}
}
