package com.nit.service;

import java.util.List;

import com.nit.model.Employee;

public interface IEmployeeService 
{
	public String addEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public String updateEmployeeSalary(long id, double newSalary);
	public String deleteEmployee(long id);
}
