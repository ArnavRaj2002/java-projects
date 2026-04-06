package com.nit.runner;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Employee;
import com.nit.repo.IEmployeeRepository;
@Component
public class EmployeeRunner implements CommandLineRunner{
	@Autowired
private IEmployeeRepository repo; //if 1 req
Scanner sc=new Scanner(System.in);
	@Override
	public void run(String... args) throws Exception {
		if(repo.count()==0)
		{
		  //Employee e1 = new Employee("Arnav Raj", List.of("Java", "Spring", "MySQL"), Set.of("OCJP", "GCP", "AWS"), Map.of("Java Backend Project", 7, "Oracle Project", 5, "Frontend Project", 3));
		Employee e2 = new Employee("Ravi Sharma", List.of("Python", "Django", "PostgreSQL"), Set.of("Azure Certified Developer", "Data Science Pro", "ML Specialist"), Map.of("AI Model Project", 8, "Automation Suite", 9, "Analytics Dashboard", 7));
		Employee e3 = new Employee("Sneha Patel", List.of("React", "Node.js", "MongoDB"), Set.of("Full Stack Developer", "AWS Practitioner", "UI/UX Designer"), Map.of("E-Commerce Platform", 9, "Chat Application", 8, "Inventory Tool", 6));
		Employee e4 = new Employee("Rahul Verma", List.of("C#", ".NETCore", "SQLServer"), Set.of("MS Certified", "Azure Fundamentals", "Agile Practitioner"), Map.of("Banking System", 9, "HR Portal", 7, "CRM Integration", 8));
		Employee e5 = new Employee("Neha Gupta", List.of("Kotlin", "Java", "SpringBoot"), Set.of("Android Developer", "OCP", "DevOps Certified"), Map.of("Mobile Banking App", 8, "Payment Gateway", 9, "User Dashboard", 7));
			
			Employee e1=Employee.builder()
					.empName("Arnav Raj")
					.skills(List.of("Java", "Spring", "MySQL"))
					.certifications(Set.of("OCJP", "GCP", "AWS"))
					.projectRatings(Map.of("Java Backend Project", 7, "Oracle Project", 5, "Frontend Project", 3)).build();
					List<Employee> saveAll = repo.saveAll(List.of(e1,e2,e3,e4,e5));
		System.out.println(saveAll.size()+" records inserted Sucessfully !!");
		}
		else
		{
			System.out.println("All Inserted Records :- ");
			repo.findAll().forEach(System.out::println);
			System.out.println("Enter skill name ");
			String skill=sc.next();
			System.out.println("List of records having skill :: "+skill);
			repo.findBySkillName(skill).forEach(System.out::println);
		}
	}

}
