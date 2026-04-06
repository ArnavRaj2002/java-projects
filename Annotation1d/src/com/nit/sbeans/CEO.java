package com.nit.sbeans;

public class CEO {
private String name;

private int experienceYears;

public void setName(String name) {
	this.name = name;
}

public void setExperienceYears(int experienceYears) {
	this.experienceYears = experienceYears;
}

@Override
public String toString() {
	return "CEO [name=" + name + ", experienceYears=" + experienceYears + "]";
}



}
