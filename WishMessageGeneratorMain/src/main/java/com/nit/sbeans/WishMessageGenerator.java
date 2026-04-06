package com.nit.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator 
{
	@Autowired
	private LocalDateTime ldt ;

	public String wishAlert(String msg)
	{
		int day = ldt.getHour();
		
		if(day >= 4 && day <= 12)
			return msg+" Morning !!!";
		
		else if(day >13 && day <= 20)
			return msg+" Evening !!!";
		
		else
			return msg+" Night !!!";
	}
}
