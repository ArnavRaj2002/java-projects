package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackages = "com.nit")
public class AppConfigg {
@Bean(name="messageSource")
public ResourceBundleMessageSource getRBMS()
{
	ResourceBundleMessageSource rbms=new ResourceBundleMessageSource();
	rbms.setBasename("com\\nit\\commons\\login");
	return rbms;
}
}
