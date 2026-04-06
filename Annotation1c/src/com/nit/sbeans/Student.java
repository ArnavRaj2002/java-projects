package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stu")
public class Student {
	 
private String name;
@Autowired
private Address address;

//public Student(String name, Address address) {
//	super();
//	this.name = name;
//	this.address = address;
//}

public void setName(String name) {
	this.name = name;
}

public void setAddress(Address address) {
	this.address = address;
}
public String showStudentDetails()
{
	return "Name :"+name+" Address : "+address;
}
}
