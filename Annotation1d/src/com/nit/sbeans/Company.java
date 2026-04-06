package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
 
public class Company {
private CEO ceo;
@Autowired
public void setCeo(CEO ceo) {
	this.ceo = ceo;
}

public void displayCompanyInfo() {
	System.out.println(ceo.toString());
}
}
