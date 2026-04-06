package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.EmployeeDAO;
import com.nit.model.Employee;
@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	private EmployeeDAO dao;
	@Override
	public String addEmployee(Employee employee) 
	{
		return dao.addEmployee(employee);
 		 
	}
	@Override
	public List<Employee> getAllEmployees() {
		 List<Employee> allEmployees = dao.getAllEmployees();
		return allEmployees;
	}
	@Override
	public String updateEmployeeSalary(long id, double newSalary) {
		 String updateEmployeeSalary = dao.updateEmployeeSalary(id, newSalary);
		return updateEmployeeSalary;
	}
	@Override
	public String deleteEmployee(long id) {
	 String deleteEmployee = dao.deleteEmployee(id);
		return deleteEmployee;
	}

}
