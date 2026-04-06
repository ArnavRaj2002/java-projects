package com.nit.service;

import com.nit.Employee.Employee;

public interface IEmployeeService {
	void addEmployee(Employee e);

	void getAllEmployees();

	void getEmployeeById(int id);

	void updateEmployeeSalary(int id, double newSalary);

	void deleteEmployee(int id);

}
