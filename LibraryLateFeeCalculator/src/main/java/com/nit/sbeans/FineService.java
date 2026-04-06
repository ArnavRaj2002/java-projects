package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component
public class FineService {
	public double calculateFine(int daysLate, double finePerDay)
	{
		double totalFine = daysLate * finePerDay;
		return totalFine;
	}

}
