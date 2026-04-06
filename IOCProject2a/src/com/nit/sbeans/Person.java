package com.nit.sbeans;

public class Person {

	private String name;
	private Address address;
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String displayInfo() {
		return "Name : "+name+" from => Country: "+address.getCountry() +" City: "+ address.getCity();
	}
}
