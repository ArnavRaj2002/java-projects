package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name="Emp_API")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@SequenceGenerator(name ="seq1",sequenceName ="emp_seq",initialValue = 10,allocationSize =5)
	@GeneratedValue(generator = "seq1",strategy = GenerationType.SEQUENCE)
private Long id;
private String name;
private String department;
private Double salary;
}
