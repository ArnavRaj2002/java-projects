package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @SequenceGenerator(
        name = "course_seq_gen",
        sequenceName = "COURSE_SEQ",
        initialValue = 1,
        allocationSize = 1
    )
    @GeneratedValue(
        generator = "course_seq_gen",
        strategy = GenerationType.SEQUENCE
    )
    private Integer id;

    private String title;
    private String instructor;
    private Integer duration;
    private Double fees;
}
