package com.nit.Employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "Emp_Info1")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @NonNull
	private String name;
    @NonNull
	private String department;
    @NonNull
	private Double salary;
}
