package com.nit.runner;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Student;
import com.nit.service.StudentService;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentService studentService;
	Scanner sc = new Scanner(System.in);

	@Override
	public void run(String... args) throws Exception {
while(true)
{
	
	System.out.println("\n========================= >Choices< ====================================");
	System.out.println("1. find List of students by City");
	System.out.println("2. find List of students by Grade greater than equal");
	System.out.println("3. find List of students by first name starting with");
	System.out.println("4. find List of students by Active and Grade between");
	System.out.println("------------------------------------------------------------------------");
	System.out.println("Enter Choice ");
	int choice = sc.nextInt();
	sc.nextLine();
	switch (choice) {
	case 1:
		System.out.println("Enter City Name ");
		String city = sc.nextLine();
		List<Student> byCity = studentService.findByCity(city);
		//byCity.forEach(System.out::println);
		if(byCity.isEmpty()) {
		    System.out.println("No students found for city: " + city);
		} else {
		    byCity.forEach(System.out::println);
		}
		break;
	case 2:
		System.out.println("Enter Grade ");
		Integer grade = sc.nextInt();
		studentService.findByGradeGreaterThanEqual(grade).forEach(System.out::println);
		break;
	case 3:
		System.out.println("Enter Prefix Name ");
		String prefixName = sc.nextLine();
		studentService.findByFirstNameStartingWith(prefixName).forEach(System.out::println);
		break;
	case 4:
		System.out.println("Enter [Active/Inactive] ");
		Integer isActive = sc.nextInt();
		System.out.println("Enter Max Marks ");
		Integer maxMarks = sc.nextInt();
		System.out.println("Enter Min Marks ");
		Integer minMarks = sc.nextInt();
		List<Student> byActiveAndGradeBetween = studentService.findByActiveAndGradeBetween(isActive, minMarks,maxMarks);
		byActiveAndGradeBetween.forEach(System.out::println);
		break;
		
	default:
		System.out.println("Invalid Choice");
		break;
	}
}

	}

}
