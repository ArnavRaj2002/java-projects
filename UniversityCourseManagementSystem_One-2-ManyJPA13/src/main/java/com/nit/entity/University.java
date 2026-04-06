package com.nit.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
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
@Table(name = "University_JPA")
public class University {
@Id	
@SequenceGenerator(name ="gen1",sequenceName ="jpa13_seq",initialValue = 111,allocationSize = 10)
@GeneratedValue(generator="gen1",strategy = GenerationType.SEQUENCE)
private	Long universityId;
@NonNull
private	String universityName;
@NonNull
private	String location;

@OneToMany(targetEntity =Course.class,
cascade = CascadeType.ALL,
fetch = FetchType.EAGER,
mappedBy = "university")
//@JoinColumn()
//@NonNull
private List<Course> courses;

//@Override
//public String toString() {
//	return "University [universityId=" + universityId + ", universityName=" + universityName + ", location=" + location
//			+ ", courses=" + courses + "]";
//}

@Override
public String toString() {
	return "University [universityId=" + universityId + ", universityName=" + universityName + ", location=" + location
			+ "]";
}


}
