package com.nit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Employee.Employee;
import com.nit.repo.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public void addEmployee(Employee e) {
		if (e != null) {
			empRepo.save(e);
			System.out.println("Data saved successfully to DB having ID: " + e.getId());
		} else
			System.out.println("Data not saved successfully to DB having ID: ");
	}

	@Override
	public void getAllEmployees() {
		empRepo.findAll().forEach(System.out::println);
	}

	@Override
	public void getEmployeeById(int id) {
		if (empRepo.existsById(id)) {
			Optional<Employee> byId = empRepo.findById(id);
			System.out.println("record found having id: " + id);
			System.out.println(byId);
			System.out.println(byId.get());
		} else
			System.out.println("record not found having id: " + id);

	}

	@Override
	public void updateEmployeeSalary(int id, double newSalary) {
//		Optional<Employee> byId = empRepo.findById(id);
//		 if(byId.isPresent())
//		 {
//			 Employee employee = byId.get(); //fetch the existing entity from the DB
		//[.get() retrieves the Employee object inside the Optional.]
//			 employee.setSalary(newSalary); //modify existing entity
//			 empRepo.saveAndFlush(employee);// update the salary field on that existing entity.
//	 		System.out.println("New salary updated sucessfully !!");
//		 }
//		 else System.out.println("id: "+id+" not exist !!");
		if(empRepo.existsById(id))
		{
			Employee emp=new Employee();//NEW object, all fields null
			emp.setSalary(newSalary);// only salary is set
			empRepo.saveAndFlush(emp);// saves as NEW record, not update
			System.out.println("New salary updated sucessfully !!");
		}
		 else System.out.println("Id: "+id+" not exist !!");
	}

	@Override
	public void deleteEmployee(int id) {
		 
		Optional<Employee> byId = empRepo.findById(id);
		if (byId.isPresent()) {
			empRepo.deleteById(id);
			System.out.println("data having id: " + id + " deleted sucessfully !!");
		} else
			System.out.println("data having id: " + id + " is not present !!");

	}

}
