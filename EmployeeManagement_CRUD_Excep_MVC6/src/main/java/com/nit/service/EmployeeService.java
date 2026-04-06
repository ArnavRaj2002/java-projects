 package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nit.entity.Employee;
import com.nit.repo.IEmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	private IEmployeeRepository repo;

	@Override
	public Employee addEmployee(Employee e) {
		Employee save = repo.save(e);
		System.out.println("Record Inserted Having ID::" + save.getId());
		return save;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException(id + "::Not Found"));

	}

	@Override
	public String updateEmployee(Employee e) {
		Employee save = repo.save(e);
		return "Record Having ID::" + save.getId() + " Updated SUcessfully !!";
	}

	@Override
	public String deleteEmployee(int id) {
		Optional<Employee> byId = repo.findById(id);
		if (byId.isPresent()) {
			repo.deleteById(id);
			return "Employee Reord Having ID::" + id + "deleted sucessfully !!";
		} else
			return "Employee Reord Having ID::" + id + " not exist !!";
	}

	@Override
	public Page<Employee> getEmployeereportDataByPage(Pageable pageable) {
		  Page<Employee> all = repo.findAll(pageable);
		return  all;
	}

}
