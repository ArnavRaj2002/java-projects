package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
//@PropertySource(value="com\\common\\spring\\config.properties")
public class MyApplication {

	@Value("${app.name}")
	private String appName;
	@Value("${app.version}")
	private String version;
	@Value("${app.description}")
	private String description;
	@Value("${app.author}")
	private String author;
	@Value("${app.contactEmail}")
	private String eMail;
	@Value("${app.maxUsers}")
	private String maxUser;
	public void printAppDetails()
	{
		System.out.println("App Name: "+appName);
		System.out.println("App Version: "+version);
		System.out.println("App description: "+description);
		System.out.println("App author: "+author);
		System.out.println("App contactEmail: "+eMail);
		System.out.println("App maxUser: "+maxUser);

	}
	
}
