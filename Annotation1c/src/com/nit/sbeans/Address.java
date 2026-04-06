package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("add")

public class Address {
private String city="imphal";
private String state="manipur";
public void setCity(String city) {
	this.city = city;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
}

}
