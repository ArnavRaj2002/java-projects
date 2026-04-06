package com.nit.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
@Table(name = "JPA_Emp_Coll")
public class Employee {
//lazy=session not close and coll table create after entity 
    @Id
    @SequenceGenerator(name = "gen1", sequenceName = "Emp_Seq", initialValue = 10, allocationSize = 4)
    @GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
    private Integer empId;

    @NonNull
    private String empName;

     
    @ElementCollection
    @CollectionTable(                                     //based on this col we join or fk column
        name = "Emp_Skills",
        joinColumns = @JoinColumn(name = "Emp_Id", referencedColumnName = "empId")
    )
    @Column(name = "Skill_Name")
    @NonNull
    private List<String> skills;

     
    @ElementCollection
    @CollectionTable(
        name = "Emp_Certifications",
        joinColumns = @JoinColumn(name = "Emp_Id", referencedColumnName = "empId")
    )
    @Column(name = "Certificate_Name")
    @NonNull
    private Set<String> certifications;

  
    @ElementCollection
    @CollectionTable(
        name = "Emp_Project_Ratings",
        joinColumns = @JoinColumn(name = "Emp_Id", referencedColumnName = "empId")
    )
    @MapKeyColumn(name = "Project_Name") // Key of the Map
    @Column(name = "Rating")             // Value of the Map
    @NonNull
    private Map<String, Integer> projectRatings;
}
