package com.nit.runner;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Project;
import com.nit.service.IProjectService;

@Component
public class ProjectRunner implements CommandLineRunner {

	@Autowired
	private IProjectService projService;

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n=====> PROJECT QUERY MENU <=====");
			System.out.println("0. Insert Record to DB Table !!");
			System.out.println("1. Find projects that started after a given date");
			System.out.println("2. Find projects that ended before a given date");
			System.out.println("3. Find projects with budget greater than specified amount");
			System.out.println("4. Find projects where client name starts with a prefix");
			System.out.println("5. Find completed projects");
			System.out.println("6. Find projects not yet completed");
			System.out.println("7. Find top 3 projects by highest budget");
			System.out.println("8. Find projects where name contains a keyword (ignore case)");
			System.out.println("=====================================================================");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				Project proj = new Project("amazon", "Arnav", LocalDate.of(2022, 8, 29), LocalDate.of(2024, 12, 30),
						250000D, true);
				Project save = projService.saveProject(proj); // ?? w/o make save() in service directly calling repo
																// save() [comes from JPA/CRUD] work to insert record or
																// not
				if (save != null)
					System.out.println("Record Inserted Sucessfully !!");
				else
					System.out.println("Record Not Inserted !!");
				break;
			case 1:
				LocalDate startDate = LocalDate.of(2022, 9, 29);
				projService.findByStartDateAfter(startDate).forEach(System.out::println);
				break;
			case 2:
				LocalDate endDate = LocalDate.of(2022, 9, 29);
				projService.findByStartDateAfter(endDate).forEach(System.out::println);
				break;
			case 3:
				System.out.println("Enter amount ");
				Double amount = sc.nextDouble();
				projService.findByBudgetGreaterThan(amount).forEach(System.out::println);
				break;
			case 4:
				System.out.println("Enter prefix Name ");
				String prefix = sc.next();
				projService.findByClientNameStartingWith(prefix).forEach(System.out::println);
				break;
			case 5:
				projService.findByCompletedTrue().forEach(System.out::println);
				break;
			case 6:
				projService.findByCompletedFalse().forEach(System.out::println);
				break;
			case 7:
				projService.findTop3ByOrderByBudgetDesc().forEach(System.out::println);
				break;
			case 8:
				System.out.println("Enter Keyword ");
				String projectKeyword = sc.next();
				projService.findByProjectNameContainingIgnoreCase(projectKeyword).forEach(System.out::println);
				break;
			default:
				System.out.println("Invalid Choice !!!! ");

			}
		}
	}

}
