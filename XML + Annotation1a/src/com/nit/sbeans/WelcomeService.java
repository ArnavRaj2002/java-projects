package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ws")
public class WelcomeService {

	
	private Employee emp;
	
	
	public WelcomeService(Employee emp) {
		super();
		this.emp = emp;
	}
	public WelcomeService( ) {
		super();
		 
	}
	

	 
	public Employee getEmp() {
		return emp;
	}

	@Autowired
	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public String message() {
		return "Welcome "+emp.getName()+" Your department is "+emp.getDepartment();
	}
	 

	
	 

	 
	
}
