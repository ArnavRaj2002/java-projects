package com.nit.sbeans;

public class Customer {
private String customerName;
private String contactNumber;
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
@Override
public String toString() {
	return "Customer [customerName=" + customerName + ", contactNumber=" + contactNumber + "]";
}





}
