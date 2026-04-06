package com.nit;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.controller.EmployeeController;
import com.nit.model.Employee;

@SpringBootApplication
public class EmployeeManagementJdbcDataSourceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(EmployeeManagementJdbcDataSourceApplication.class,
				args);
		EmployeeController employeeController = ctx.getBean(EmployeeController.class);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.-> Insertion");
			System.out.println("2.-> Retrival");
			System.out.println("3.-> Updation");
			System.out.println("4.-> Deletion");
			System.out.println("Enter Choice <<==============>>");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:{
				System.out.println("Enter id : ");
				int id = Integer.parseInt(sc.nextLine());
				System.out.println("Enter name : ");
				String name =sc.nextLine();
				System.out.println("Enter department : ");
				String dept =sc.nextLine();
				System.out.println("Enter New Salary : ");
				Double salary = Double.parseDouble(sc.nextLine());
				String employee = employeeController.addEmployee(new Employee(id, name, dept, salary));
				System.out.println(employee);
				 break;
			}
			case 2: {
				List<Employee> allEmployees = employeeController.getAllEmployees();
				System.out.println(allEmployees);
				break;
			}
			case 3: {
				System.out.println("Enter id : ");
				int id = Integer.parseInt(sc.nextLine());
				System.out.println("Enter New Salary : ");
				Double salary = Double.parseDouble(sc.nextLine());
				employeeController.updateEmployeeSalary(id, salary);
				break;
			}
			case 4: {
				System.out.println("Enter id : ");
				int id = Integer.parseInt(sc.nextLine());
				String deleteEmployee = employeeController.deleteEmployee(id);
				System.out.println(deleteEmployee);
				break;
			}
			default: {
				System.out.println("Invalid Choice !!!");

			}
			}
		}

	}

}
