package com.nit.sbeans;

public class Address {
private String city;
private String country;

public Address() {
	System.out.println("Address.Address()");
}

public void setCity(String city) {
	this.city = city;
}

public String getCity() {
	return city;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

}
