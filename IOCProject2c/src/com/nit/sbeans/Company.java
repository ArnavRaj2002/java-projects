package com.nit.sbeans;

public class Company {
private Department  dept1;
private Department  dept2;
private Department  dept3;
public Company() {
	System.out.println("Company.Company()");
}
public void setDept1(Department dept1) {
	this.dept1 = dept1;
}
public void setDept2(Department dept2) {
	this.dept2 = dept2;
}
public void setDept3(Department dept3) {
	this.dept3 = dept3;
}
public void showDepartments() {
	System.out.println(dept1.displayDepartmentInfo());
	System.out.println(dept2.displayDepartmentInfo());
	System.out.println(dept3.displayDepartmentInfo());
}
}
