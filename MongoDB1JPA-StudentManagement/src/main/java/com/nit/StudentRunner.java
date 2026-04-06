package com.nit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Student;
import com.nit.service.IStudentService;
@Component
public class StudentRunner implements CommandLineRunner{
	@Autowired
private IStudentService studentService;
	@Override
	public void run(String... args) throws Exception {
//		 Student stu= new Student("om","ME",87.0);
//		 String saveStudent = studentService.saveStudent(stu);
//		 System.out.println(saveStudent);
		
		 System.out.println("========FIND ALL=======");
		 List<Student> allStudents = studentService.findAllStudents();
		 allStudents.forEach(System.out::println);
		 
		 System.out.println("========COUNT=======");
		 Long countStudents = studentService.countStudents();
		 System.out.println(countStudents);
		 
		 System.out.println("========EXIST=======");
		  String studentExistById = studentService.isStudentExistById("694162575e2f90a6901ef93c1");
		 System.out.println(studentExistById);
		 
		 System.out.println("========FIND by ID=======");
		 String studentById = studentService.findStudentById("69416341ad73397fa75e81c425");
		 System.out.println(studentById);
		 
		//String saveAllStudents = studentService.saveAllStudents(List.of(new Student("Arnav","CSE",69.0),new Student("Aryan","IT",53.0)));
		//System.out.println(saveAllStudents);
		 
		 System.out.println("========DELETE=======");
		 String deleteStudentById = studentService.deleteStudentById("694165a075cd1d28332005e11");
		 System.out.println(deleteStudentById);
		 
		 System.out.println("========UPDATE=======");
		 String updateStudent = studentService.updateStudent("694166ae937e2fedc3c8527ck");
		 System.out.println(updateStudent);
		 
		 System.out.println("============Finder[Dept]==========");
		 List<Student> showByDepartment = studentService.showByDepartment("ECE");
		 showByDepartment.forEach(System.out::println);
		 System.out.println("============Query[marks,dept]==========");
		 List<Object[]> showByMarksAndDepartment = studentService.showByMarksAndDepartment(25d,"ECE");
		 showByMarksAndDepartment.forEach(row->{
			 for(Object val:row)
			 {
				 System.out.print(val);
			 }
		 });

	}

}
