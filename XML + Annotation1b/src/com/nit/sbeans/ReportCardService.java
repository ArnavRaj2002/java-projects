package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("rcs")
public class ReportCardService {
	@Autowired
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	int totalMarks=0;
	public void ReportCard() {
		System.out.println("Report Card for "+student.getName());
		 System.out.println("roll: "+student.getRollNo());
		System.out.println("Total Marks: "+student.getMarks());
		int[] marks = student.getMarks();
		 for (int mark : marks) {
			  totalMarks+=mark;
		}
		 System.out.println("Total Marks: "+totalMarks);
		 if(totalMarks>350) System.out.println("Grade: A");
		 else System.out.println("Grade: other than A");
	}
}
