package com.nit.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.Employee.Employee;
import com.nit.service.EmployeeService;
import com.nit.service.IEmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner{

    private final EmployeeService employeeService;
	@Autowired
private IEmployeeService empService;

    EmployeeRunner(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("========> Menu <=======");
	 		System.out.println("1️.Add Employee\r\n"
	 				+ "\r\n"
	 				+ "2️. View All Employees\r\n"
	 				+ "\r\n"
	 				+ "3️. Find Employee by ID\r\n"
	 				+ "\r\n"
	 				+ "4️. Update Salary\r\n"
	 				+ "\r\n"
	 				+ "5️. Delete Employee\r\n"
	 				+ "\r\n"
	 				+ "6️. Exit\r\n"
	 				+ "");
	 		System.out.println("================");
	 		System.out.println("Enter choice:- ");
	 		int choice=sc.nextInt();
	 		switch(choice)
	 		{
	 		case 1:
	 			Employee emp=new Employee();
	 			emp.setName("Arnav"); emp.setSalary(1000.00); emp.setDepartment("IT");
	 			empService.addEmployee(emp);
	 			break;
	 		case 2:
	 			empService.getAllEmployees();
	 			break;
	 		case 3:
	 			System.out.println("Enter ID: ");
	 			int id=sc.nextInt();
	 			empService.getEmployeeById(id);
	 			break;
	 		case 4:
	 			System.out.println("Enter ID: ");
	 			id=sc.nextInt();
	 			System.out.println("Enter new Salary: ");
	 			double salary=sc.nextDouble();
	 			employeeService.updateEmployeeSalary(id,salary);
	 			break;
	 		case 5:
	 			System.out.println("Enter ID: ");
	 			id=sc.nextInt();
	 			empService.deleteEmployee(id);
	 			break;
	 		case 6:
	 			System.out.println("Exiting !!!!!!");
	 			System.exit(0);
	 			break;
 		}
	}
	}
}
