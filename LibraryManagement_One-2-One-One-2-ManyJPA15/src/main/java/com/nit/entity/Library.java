package com.nit.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Library {
@SequenceGenerator(name="seq1",sequenceName ="JPA_15",initialValue = 10,allocationSize = 5)
@GeneratedValue(generator ="seq1",strategy = GenerationType.SEQUENCE)
private Long	lid;
@NonNull
private String	libraryName;
@NonNull
private String	location;
@OneToMany(targetEntity =Book.class,cascade =CascadeType.ALL,fetch = FetchType.EAGER,mappedBy ="library")
private List<Book>	books;

}
