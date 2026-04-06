package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component
public class NumberService {
	public String checkEvenOdd(int number)
	{
		return (number%2==0)?" even":" odd";
	}
}
