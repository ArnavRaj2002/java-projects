package com.nit.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@NoArgsConstructor
//@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "projects")
public class Project 
{
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY)
private Integer id;
@NonNull
private String projectName;
@NonNull
private String clientName;
@NonNull
private LocalDate startDate;
@NonNull
private LocalDate endDate;
@NonNull
private Double budget;
@NonNull
private Boolean completed;

}
