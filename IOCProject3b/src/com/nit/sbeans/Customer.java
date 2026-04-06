package com.nit.sbeans;

public class Customer {
  private String customerName;
  private String customerAddress;
  private double balance;
  private Bank bank; //HAS-A
  //how to decide why we need setter method or getter method ??
  public Customer() {
	  System.out.println("Customer.Customer()");
  }
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public void setBank(Bank bank) {
	this.bank = bank;
}
   public void deposit(double amount) {
	  balance+=amount;
   }
   public void withdraw(double amount) {
	  balance-=amount;
   }
  
   public String getCustomerName() {
	return customerName;
}
public String getCustomerAddress() {
	return customerAddress;
}
public double getBalance() {
	return balance;
}
public Bank getBank() {
	return bank;
}
public String displayCustomerDetails() {
	  return "CustomerName: "+customerName+" CustomerAddress: "+customerAddress+" Balance: "+balance+" bankDetails[ "+bank.displayBankDetails()+" ]";
   }
}
