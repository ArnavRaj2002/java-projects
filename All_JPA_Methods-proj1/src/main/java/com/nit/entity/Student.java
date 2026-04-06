package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="myStud")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Student_Restful")
public class Student {
	private String stuName;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long stuId;
	//@ManyToOne
	//@JoinColumn(name="student_FK") //FK[always on ManyToOne side--> Owning side]
//	private University university;
	 

}
