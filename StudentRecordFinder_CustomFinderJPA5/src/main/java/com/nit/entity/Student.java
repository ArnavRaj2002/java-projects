package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "Student_NiT")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
	@NonNull
	@Column(name = "Fname",length =30)
private String firstName;
	@NonNull
	@Column(name = "Lname",length =30)
	private String lastName;
	@NonNull
private Integer grade;
	@NonNull
	@Column(length = 30,name = "cityName")
private String city;
	@NonNull
private Integer active;

}
