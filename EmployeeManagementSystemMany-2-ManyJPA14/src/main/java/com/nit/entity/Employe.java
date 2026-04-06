package com.nit.entity;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "JPA_EMPLOYEE14")
public class Employe {

    @Id
    @SequenceGenerator(name = "seq2", sequenceName = "JPA_SEQ14A", initialValue = 222, allocationSize = 5)
    @GeneratedValue(generator = "seq2", strategy = GenerationType.SEQUENCE)
    private Long eid;

    private String name;
    private String department;

    // ✅ Independent join table for employee-project mapping
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
        name = "JPA_EMP_PROJECT_MAP",
        joinColumns = @JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "eid"),
        inverseJoinColumns = @JoinColumn(name = "PROJECT_ID", referencedColumnName = "pid")
    )
    private List<Project> projects;

    @Override
    public String toString() {
        return "Employe [eid=" + eid + ", name=" + name + ", department=" + department + "]";
    }
}
