package com.nit.sbeans;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

@Component
public class LoginService {
	@Autowired
	ResourceBundleMessageSource messageSource;

	public void displyMessage(String username, String password,String langCode) {
        Locale locale =new Locale(langCode);
        if (username.equals("arnav") && password.equals("123")) {
        String message = messageSource.getMessage("loginn.msgg", null, locale);
        
        System.out.println("Login msg=> "+message);
        }
        else System.err.println("Wrong credentials");
	}
}
