package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;
import com.nit.sbeans.Student;

public class DependencyInjection {

	public static void main(String[] args) {
		try( AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class))
		{ 
			 Student student = ctx.getBean( Student.class);
			 String studentDetails = student.showStudentDetails();
			 System.out.println(studentDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
