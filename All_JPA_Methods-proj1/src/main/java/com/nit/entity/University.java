package com.nit.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="myUniv")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="University_Restful")
public class University {
	private String univName;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer univId;
	//@OneToMany(mappedBy="university",cascade = CascadeType.ALL)
	//private List<Student> listOfStudent;

}
