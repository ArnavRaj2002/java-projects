package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
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
public class BookDetail {
@SequenceGenerator(name="seq3",sequenceName = "JPA_15c",initialValue = 30,allocationSize = 5)
@GeneratedValue(generator ="seq3",strategy =GenerationType.SEQUENCE)
private Long	bdid;
@NonNull
private String	isbn;
@NonNull
private String	publisher;

private int	publishedYear;

}
