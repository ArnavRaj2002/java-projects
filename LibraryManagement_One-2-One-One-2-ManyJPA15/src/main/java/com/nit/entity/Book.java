package com.nit.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Book {
@SequenceGenerator(name="seq2",sequenceName ="JPA_15b",initialValue = 20,allocationSize = 5)
@GeneratedValue(generator ="seq2",strategy = GenerationType.SEQUENCE)
private Long	bid;
@NonNull
private String	title;
@NonNull
private String	author;
@ManyToOne(targetEntity =Library.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
@JoinColumn(name ="Lib_ID",referencedColumnName ="lid")
private Library	library;

}
