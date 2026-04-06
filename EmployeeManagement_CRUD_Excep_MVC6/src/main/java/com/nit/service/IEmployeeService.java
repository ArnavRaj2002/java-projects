package com.nit.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nit.entity.Employee;

public interface IEmployeeService {
	public Employee	addEmployee(Employee e);

	public List<Employee>	getAllEmployees();

	//public Optional<Employee>	getEmployeeById(int id);
	public Employee	getEmployeeById(int id);

	public String	updateEmployee(Employee e);

	public String	deleteEmployee(int id);
	//for page releated details
    public Page<Employee> getEmployeereportDataByPage(Pageable pageable);
	 
}
