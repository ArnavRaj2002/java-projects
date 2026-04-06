package com.nit.runner;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Employee;
import com.nit.repo.IEmployeeRepo;
import com.nit.service.EmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	private EmployeeService empService;
	@Autowired
	private IEmployeeRepo empRepo;
	Scanner sc = new Scanner(System.in);

	@Override
	public void run(String... args) throws Exception {
		while (true) {
			System.out.println("\n ============>      <============== ");
			System.out.println("0. Add/Insert Records in DB ");
			System.out.println("1. Employees joined after a given date");
			System.out.println("2. Employees in a department with a specific prefix ");
			System.out.println("3. Active/InActive employees details   ");
			System.out.println("Enter Choice:");
			int choice = sc.nextInt();
			// sc.nextLine();
			switch (choice) {
			case 0:
				List<Employee> of = List.of(new Employee(101L, "Arnav", "IT", 25000.0, LocalDate.of(2024, 8, 29), true),
						new Employee(102L, "Riya", "HR", 30000.0, LocalDate.of(2023, 3, 15), true),
						new Employee(103L, "Amit", "Finance", 28000.0, LocalDate.of(2022, 11, 5), false),
						new Employee(104L, "Sneha", "IT", 35000.0, LocalDate.of(2021, 6, 21), true),
						new Employee(105L, "Rohit", "Admin", 27000.0, LocalDate.of(2023, 9, 10), true));
				List<Employee> saveAll = empRepo.saveAll(of);
				System.out.println(saveAll.size() + " no. of Records inserted Sucessfully !!");
				break;
			case 1:
				// System.out.println("Enter local date");
				LocalDate lDate = LocalDate.of(2022, 8, 29);
				System.out.println("List of Employess Joined after " + lDate);
				empService.getEmployeeJoinedAfterDate(lDate).forEach(System.out::println);
				break;
			case 2:
				System.out.println("Enter Name Prefix Name ");
				String prefixName = sc.next();
				Iterable<Employee> employeeWithPrefix = empService.getEmployeeWithPrefix(prefixName);
				System.out.println(employeeWithPrefix);
				employeeWithPrefix.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Enter employees active status [true/false] ");
				Boolean isActive = sc.nextBoolean();
				empService.activeEmployees(isActive).forEach(System.out::println);
				break;
			default:
				System.out.println("Invalid Choice !!");
			}
		}

	}

}
