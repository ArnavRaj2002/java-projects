package com.nit.service;

import java.time.LocalDate;
import java.util.List;

import com.nit.entity.Project;

public interface IProjectService {
	
	public Project saveProject(Project proj);  
	
	List<Project> findByStartDateAfter(LocalDate date);
	
	 //Find all projects that ended before a given date
    List<Project> findByEndDateBefore(LocalDate date);

    //Find projects where the budget exceeds a specified amount
    List<Project> findByBudgetGreaterThan(Double amount);

    //Find projects whose clientName starts with a given prefix
    List<Project> findByClientNameStartingWith(String prefix);

    //Find completed projects only
    List<Project> findByCompletedTrue();

    //Find projects that are not yet completed
    List<Project> findByCompletedFalse();

    // Find top 3 projects ordered by highest budget
    List<Project> findTop3ByOrderByBudgetDesc(); //??

    //Find all projects where projectName contains a keyword
    List<Project> findByProjectNameContainingIgnoreCase(String keyword);

	
}
