package com.nit.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SortingContext {
	@Autowired
	@Qualifier("ss")
	private SortingStrategy strategy;
	
	void setStrategy(SortingStrategy strategy)
	{
		this.strategy=strategy;
	}
	
	void executeSort(int[] numbers)
	{
		strategy.sort(numbers);
	}
}
