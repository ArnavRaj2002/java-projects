package com.nit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Course;
import com.nit.entity.University;
import com.nit.repo.ICourseRepository;
import com.nit.repo.IUniversityRepository;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private IUniversityRepository universityRepo;
	
 

	@Autowired
	private ICourseRepository courseRepo;

	@Override
	public void run(String... args) throws Exception {
		/*University university = new University();
		// University university=new University("Nit", "Hyd",null);
		Course course1 = new Course("Java", "5-Months", university);
		Course course2 = new Course(".Net", "4-Months", university);
		Course course3 = new Course("Python", "7-Months", university);
		Course course4 = new Course("UI", "3-Months", university);

		List<Course> listOfCourses = List.of(course1, course2, course3, course4);
		University universityObj = new University("Nit", "Hyd", listOfCourses);
		university.setCourses(listOfCourses);

		University save = universityRepo.save(universityObj);
		System.out.println("Data Inserted Scessfully !!");
		System.out.println("Data1:- " + universityObj);
		System.out.println("Data2:- " + listOfCourses);
		System.out.println("OR"); // OR
		System.out.println("Data2:- " + save.getCourses());
		*/
	//==================>=========<=======================
		//create parent object
		University university=new University("Nit", "Hyd");
		//create child object
		Course course1 = new Course("Java", "5-Months");
		//Course course2 = new Course(".Net", "4-Months", university);
		//assign parent to child  
		course1.setUniversity(university);
		//course2.setUniversity(university);
		//assign child to parent
		List<Course> listOfCourses = List.of(course1);
		university.setCourses(listOfCourses);
		
		University save1 = universityRepo.save(university);
		System.out.println(save1);
		               //OR
		//Course save2 = courseRepo.save(course1);
		//System.out.println(save2);
		 
		List<University> allList = universityRepo.findAll();//how decide which findAll()
		allList.forEach(columns->{
			System.out.println("O/p:: "+columns);
		});
		System.out.println("============OR===========");
		allList.forEach(System.out::println);
		
		

	}

}
