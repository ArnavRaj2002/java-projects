package com.nit.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.nit.sbeans.CEO;
import com.nit.sbeans.Company;

@Configuration

@ComponentScan(basePackages = "com.nit.sbeans")
public class AppConfig {

	@Bean("ceo")
	public CEO setCEODetails() {
		 CEO ceo=new CEO();
		 ceo.setName("Scott");
		 ceo.setExperienceYears(11);
		 return   ceo;
	}
	@Bean("comp")
	public Company setCompanyDetails() {
		Company company=new Company();
		company.setCeo(setCEODetails());
		return company;
	}
}
