package com.nit.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Project;
import com.nit.repo.IProjectRepo;

@Service
public class ProjectService implements IProjectService{
@Autowired
private IProjectRepo projRepo;

@Override
public List<Project> findByStartDateAfter(LocalDate date) {
	 
	return projRepo.findByStartDateAfter(date);
}

@Override
public List<Project> findByEndDateBefore(LocalDate date) {
	 
	return projRepo.findByEndDateBefore(date);
}

@Override
public List<Project> findByBudgetGreaterThan(Double amount) {
	 
	return projRepo.findByBudgetGreaterThan(amount);
}

@Override
public List<Project> findByClientNameStartingWith(String prefix) {
	 
	return projRepo.findByClientNameStartingWith(prefix);
}

@Override
public List<Project> findByCompletedTrue() {
	 
	return projRepo.findByCompletedTrue();
}

@Override
public List<Project> findByCompletedFalse() {
	 
	return projRepo.findByCompletedFalse();
}

@Override
public List<Project> findTop3ByOrderByBudgetDesc() {
	 
	return projRepo.findTop3ByOrderByBudgetDesc();
}

@Override
public List<Project> findByProjectNameContainingIgnoreCase(String keyword) {
	 
	return projRepo.findByProjectNameContainingIgnoreCase(keyword);
}

@Override
public Project saveProject(Project proj) {
	return projRepo.save(null);
}



}
