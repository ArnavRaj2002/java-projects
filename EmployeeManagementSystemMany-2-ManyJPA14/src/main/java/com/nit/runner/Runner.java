package com.nit.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Employe;
import com.nit.entity.Project;
import com.nit.repo.IEmployeeRepo;
import com.nit.repo.IProjectRepo;
@Component
public class Runner implements CommandLineRunner{
	@Autowired
private IEmployeeRepo empRepo;
	@Autowired
private IProjectRepo projRepo;
	Scanner sc=new Scanner(System.in);
	@Override
	public void run(String... args) throws Exception {
		 //Owning Object
		Project proj1=new Project("Java_SBMS","5-Months");
		Project proj2=new Project("Java_React","6-Months");
		//non-Owning Object
//		Employe emp1=new Employe("Arnav", "IT");
//		Employe emp2=new Employe("Aryan", "SE");
		Employe employe1 = Employe.builder().name("Raj").department("SDE").build();
		Employe employe2 = Employe.builder().name("Singh").department("SSE").build();
		
		
//		employe1.setProjects(List.of(proj1,proj2));
//		employe2.setProjects(List.of(proj1,proj2));
//		
//		proj1.setEmployees(Arrays.asList(employe1,employe2));
//		proj2.setEmployees(Arrays.asList(employe1,employe2));
		// 🔧 Use mutable lists instead of List.of()
		employe1.setProjects(new ArrayList<>(List.of(proj1, proj2)));
		employe2.setProjects(new ArrayList<>(List.of(proj1, proj2)));

		proj1.setEmployees(new ArrayList<>(List.of(employe1, employe2)));
		proj2.setEmployees(new ArrayList<>(List.of(employe1, employe2)));

//		projRepo.save(proj1);
//		projRepo.save(proj2);
		projRepo.saveAll(List.of(proj1,proj2));
		System.out.println("Record Inserted");
		
		System.out.println("================fetch Records ====================");
		projRepo.findAll().forEach(System.out::println);
		empRepo.findAll().forEach(System.out::println);
		System.out.println("================fetch Records by Parent ====================");
		Iterable<Project> all = projRepo.findAll();
		all.forEach(project->{
			System.out.println(project);
			List<Employe> employees = project.getEmployees();
			employees.forEach(employee->{
				System.out.println(employee);
			});
		});
		
	//Delete a project by ID ,both project and employee deleted
//		System.out.println("Enter Employee ID::");
//		Long id=sc.nextLong();
//		if(projRepo.existsById(id))
//		{
//			projRepo.deleteById(id);
//			System.out.println(id+"::Deleted Sucessfully !!");
//		}
//		else System.out.println(id+"not found !!");
		
		//Delete a project by ID only,Only the project is deleted, employees remain
		System.out.println("Enter Employee ID::");
		Long id=sc.nextLong();
		  Optional<Project> byId = projRepo.findById(id);
		if(byId.isEmpty()) {
			System.out.println("no data in db");
			return;
		}
			Project project = byId.get();
			//Break the relationship from the inverse side(Employee side)
			for(Employe e: new ArrayList<>(project.getEmployees())) {
				e.getProjects().remove(project);// remove project from employee
				empRepo.save(e);
			}
			//Break the relationship from owning side(Project side)
			project.getEmployees().clear();
			projRepo.save(project);
			//Now safely delete the project
			projRepo.delete(project);
			
	}

}

















