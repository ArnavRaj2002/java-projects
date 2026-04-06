package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;
import com.nit.sbeans.Library;

public class DependencyInjection {

	public static void main(String[] args) {
		 try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class))
		 {
			 Library library = ctx.getBean(Library.class );
			 String showBookDetails = library.showBookDetails();
			 System.out.println(showBookDetails);
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
