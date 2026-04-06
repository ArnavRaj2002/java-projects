package com.nit.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Employee;
import com.nit.repo.IEmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
private IEmployeeRepo empRepo;
	public Iterable<Employee> getEmployeeJoinedAfterDate(LocalDate lDate)
	{ 
		return empRepo.getEmployeeJoinedAfterDate(lDate);
	}
	public Iterable<Employee> getEmployeeWithPrefix(String prefixName)
	{
		return empRepo.getEmployeeWithPrefix(prefixName);
	}
	public Iterable<Employee> activeEmployees(Boolean isActive)
	{
		return empRepo.activeEmployees(isActive);
	}
}
