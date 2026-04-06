package com.nit.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.MessageService;

public class MeassageMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter language code");
		String lang = sc.nextLine();
		MessageService bean = ctx.getBean(MessageService.class);
		bean.greetingMessage(lang);

// String lang=sc.next();
// System.out.println("Enter country code");
// String country=sc.next();
// Locale locale=Locale.of(lang, country);
// String message = ctx.getMessage("welcome.message",new Object[] {},locale);
// //String message = ctx.getMessage("welcome.message",new Object[] {},locale);
		// System.out.println(message);
		ctx.close();
	}

}
