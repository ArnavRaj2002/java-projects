package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Address;
import com.nit.entity.Employee;
import com.nit.repo.IAddressRepository;
import com.nit.repo.IEmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	private IEmployeeRepository empRepo;
	@Autowired
	private IAddressRepository addRepo;
 public void saveEmployeeWithAddress(Address ad,Employee e)
{
	 empRepo.save(e);
	 addRepo.save(ad);
	
	
}
 public Employee getEmployeeDetails(Long id)
 {
	 if(empRepo.existsById(id))
	 {
		 return  empRepo.findById(id).get();
	 }
	 else 
		 {
		 System.out.println(id+" not exist !!");
		 return null;
		 }
	 
 }
}
