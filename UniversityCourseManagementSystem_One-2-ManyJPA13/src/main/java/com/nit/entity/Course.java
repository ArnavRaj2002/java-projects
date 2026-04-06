package com.nit.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "Table_JPA")
public class Course {
	@Id
	@SequenceGenerator(name = "gen2",sequenceName = "jpa13a_seq",initialValue = 211,allocationSize =10)
	@GeneratedValue(generator ="GEN2",strategy = GenerationType.SEQUENCE)
	private Long courseId;
	@NonNull
	private String courseName;
	@NonNull
	private String duration;
	
	//@NonNull 
	@ManyToOne(targetEntity = University.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY )
	@JoinColumn(name ="UnIv_iD",referencedColumnName="universityId" )
	private University university;
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + "]";
	}


}
