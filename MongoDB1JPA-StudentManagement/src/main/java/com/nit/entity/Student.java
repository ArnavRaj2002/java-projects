package com.nit.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Document(collection="StudentTable")//Maps entity class to MongoDB collection
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Student {
	@Id
private String id;
	@NonNull
private String studentName;
	@NonNull
private String department;
	@NonNull
private Double marks;
}
