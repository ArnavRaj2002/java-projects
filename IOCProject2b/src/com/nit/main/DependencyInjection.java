package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.Library;

public class DependencyInjection {

	public static void main(String[] args) {
		 FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("C:\\Users\\gaynu\\OneDrive\\Desktop\\Spring\\IOCProject2b\\src\\com\\nit\\cfgs\\ApplicationContext.xml");
		 Library library = ctx.getBean("lib",Library.class);
		 String displayBooks = library.displayBooks();
		 System.out.println(displayBooks);
		 ctx.close();
	}

}
