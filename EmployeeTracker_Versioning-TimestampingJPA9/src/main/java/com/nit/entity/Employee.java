package com.nit.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "JPA_EMp")
public class Employee 
{
	
	@Id
	@NonNull
private  Long id;
	@NonNull
private String name;
	@NonNull
private String department;
	@NonNull
private Double salary;
	@NonNull
private LocalDate dateOfJoining;
	@NonNull
private Boolean active;
	
@CreationTimestamp
private LocalDateTime createdAt;
@UpdateTimestamp
private LocalDateTime updatedAt;
@Version
private Integer version;

}
