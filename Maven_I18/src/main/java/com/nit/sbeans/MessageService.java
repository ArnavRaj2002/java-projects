package com.nit.sbeans;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;
@Component
public class MessageService {
	@Autowired
	ResourceBundleMessageSource messageSource;
	public void greetingMessage(String code)
	{

		
		Locale locale=new  Locale(code);
		
		
			 String message = messageSource.getMessage("welcome.message", null, locale);
			 System.out.println(message);
	}
}








//MessageSource messageSource;

//Locale locale;
//if(code.equalsIgnoreCase("hi"))
//{
//	locale =new Locale("hi");
//}
//else if(code.equalsIgnoreCase("te"))
//{
//	locale= Locale.of("te");
//}
//else {
//	locale=Locale.of("en");
//}