package com.nit.sbeans;

public class Employee {
	private int id;
	private String name;
	private double basicSalary;
	private double hra;
	private double da;
	private double taxPercentage;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public double getHra() {
		return hra;
	}
	public double getDa() {
		return da;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

}
