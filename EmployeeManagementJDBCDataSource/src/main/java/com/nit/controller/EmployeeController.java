package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.model.Employee;
import com.nit.service.EmployeeService;
@Controller
public class EmployeeController {
	@Autowired
	public EmployeeService service;
 
	public String addEmployee(Employee employee) 
	{
     return  service.addEmployee(employee);
	}
	
	public List<Employee> getAllEmployees() {
		 List<Employee> allEmployees = service.getAllEmployees();
		return allEmployees;
	}
	 
	public String updateEmployeeSalary(long id, double newSalary) {
		 String updateEmployeeSalary = service.updateEmployeeSalary(id, newSalary);
		return updateEmployeeSalary;
	}
	 
	public String deleteEmployee(long id) {
	 String deleteEmployee = service.deleteEmployee(id);
		return deleteEmployee;
	}

}
