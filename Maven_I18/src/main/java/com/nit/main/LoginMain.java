package com.nit.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfigg;
import com.nit.sbeans.LoginService;

public class LoginMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigg.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Language code:- ");
		String lang = sc.nextLine();
		System.out.println("Enter User Name:- ");
		String name = sc.nextLine();
		System.out.println("Enter Password:- ");
		String pass = sc.nextLine();
		LoginService loginService = ctx.getBean(LoginService.class);
		loginService.displyMessage(name,pass,lang);

		ctx.close();
		sc.close();
	}

}

/*
                                                  SOLUTION
 
login_en.properties:
--------------------
login.success=Login successful! Welcome, {0}.
login.failure=Invalid username or password.


login_hi.properties:
--------------------
login.success=लॉगिन सफल! स्वागत है, {0}.
login.failure=गलत उपयोगकर्ता नाम या पासवर्ड.


login_te.properties:
--------------------
login.success=లాగిన్ విజయవంతం! స్వాగతం {0}.
login.failure=తప్పుడు యూజర్‌నేమ్ లేదా పాస్‌వర్డ్.

AppConfig.class:
-----------------
package com.nit.cfgs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackages = "com.nit.service")
public class AppConfig {

	@Bean
	public ResourceBundleMessageSource messageSource()
	{
		ResourceBundleMessageSource rbms=new ResourceBundleMessageSource();
		rbms.setBasename("com\\nit\\commons\\login");
		return rbms;
	}
}

LoginService.class:
--------------------
package com.nit.service;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
@Component
public class LoginService {

	@Autowired
	MessageSource messageSource;
	private  final String uName="Rajat";
	private  final String passWord="12345";
	public String login(String userName,String pWord,Locale locale)
	{
		if(userName.equals(uName)&&pWord.equals(passWord))
		{
			return messageSource.getMessage("login.success", new Object[] {uName,pWord}, locale);
		}
		else {
			return messageSource.getMessage("login.failure",null,locale);
		}
	}
}

Main Class:
------------
package com.nit;
import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;
import com.nit.service.LoginService;

public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
       LoginService ls = ctx.getBean(LoginService.class);
       Scanner sc=new Scanner(System.in);
       System.out.println("Select your Language\n1.hi\n2.te\n3.en");
       int option=Integer.parseInt(sc.nextLine());
       Locale locale=null;
       switch(option)
       {
       case 1:locale=Locale.of("hi");
       break;
       case 2:locale=Locale.of("te");
       break;
       case 3:locale=Locale.of("en");
       break;
       }
    	System.out.println("Enter User Name:");
    	String uName=sc.nextLine();
    	System.out.println("Enter Password:");
    	String pWord=sc.nextLine();
    	System.out.println(ls.login(uName, pWord, locale));
       
    }
}

  
package com.example.i18nlogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class LoginService {

    @Autowired
    private MessageSource messageSource;

    // Mock credentials
    private final String VALID_USERNAME = "admin";
    private final String VALID_PASSWORD = "12345";

    public String login(String username, String password, Locale locale) {
        if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {
            return messageSource.getMessage("login.success", new Object[]{username}, locale);
        } else {
            return messageSource.getMessage("login.failure", null, locale);
        }
    }
}

*/