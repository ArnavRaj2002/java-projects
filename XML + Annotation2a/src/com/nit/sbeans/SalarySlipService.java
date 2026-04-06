package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ss")
public class SalarySlipService {
	
 private Employee employee;
 @Autowired
 public void setEmployee(Employee employee) {
		this.employee = employee;
	}

public void generateSlip() {
	 double grossSalary=employee.getBasicSalary()+employee.getHra()+employee.getDa();
	 double taxAmount=(grossSalary*employee.getTaxPercentage())/100;
	 double netSalary = grossSalary - taxAmount;

	 System.out.println("Salary Slip for John");
	 System.out.println("Gross Salary: "+grossSalary);
	 System.out.println("Tax Deducted: "+taxAmount);
	 System.out.println("Net Salary: "+netSalary);
 }
}
