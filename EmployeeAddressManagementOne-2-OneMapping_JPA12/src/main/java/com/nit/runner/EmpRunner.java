package com.nit.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Address;
import com.nit.entity.Employee;
import com.nit.repo.IEmployeeRepository;
import com.nit.service.EmployeeService;
@Component
public class EmpRunner implements CommandLineRunner {
	@Autowired
	private EmployeeService empService;
	@Autowired
	private IEmployeeRepository empRepo;
	Scanner sc=new Scanner(System.in);
	@Override
	public void run(String... args) throws Exception {
if(empRepo.count()==1) {
	

		Address add = new Address("street no.2", "patna", "Bihar", "832001");
		Employee emp = new Employee("Arnav", "Java", 20000D, add);
        empService.saveEmployeeWithAddress(add, emp);
        System.out.println("Data Inserted Sucessfully !!");
}
else {
	System.out.println("Fetch Data from DB ===");
	System.out.println("Enter id ");
	
	Long id= sc.nextLong();
	Employee employeeDetails = empService.getEmployeeDetails(id);
	System.out.println("Fetched Record Details   ==== >");
	System.out.println(employeeDetails);
}
	}

}
