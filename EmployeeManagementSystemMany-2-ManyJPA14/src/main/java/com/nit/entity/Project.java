package com.nit.entity;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "JPA_PROJECT14")
public class Project {

    @Id
    @SequenceGenerator(name = "seq1", sequenceName = "JPA_SEQ14", initialValue = 111, allocationSize = 5)
    @GeneratedValue(generator = "seq1", strategy = GenerationType.SEQUENCE)
    private Long pid;

    @NonNull
    private String name;

    @NonNull
    private String duration;

    //✅ Independent join table for project-employee mapping
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
        name = "JPA_PROJECT_EMP_MAP",
        joinColumns = @JoinColumn(name = "PROJECT_ID", referencedColumnName = "pid"),
        inverseJoinColumns = @JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "eid")
    )
    private List<Employe> employees;

    @Override
    public String toString() {
        return "Project [pid=" + pid + ", name=" + name + ", duration=" + duration + "]";
    }
}
