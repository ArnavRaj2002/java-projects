package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.Person;

public class DependencyInjection {

	public static void main(String[] args) {
		 FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("C:\\Users\\gaynu\\OneDrive\\Desktop\\Spring\\IOCProject2a\\src\\com\\nit\\cfgs\\ApplicationContext.xml");
		 Person person = ctx.getBean("per",Person.class);
		 String displayInfo = person.displayInfo( );
		 System.out.println(displayInfo);
		 ctx.close();
	}

}
