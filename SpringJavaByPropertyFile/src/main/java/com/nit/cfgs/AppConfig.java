package com.nit.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
@PropertySource(value="com\\common\\spring\\config.properties")
public class AppConfig {
	
}
