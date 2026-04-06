package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Student;
import com.nit.repo.IStudentRepository;
@Service
public class StudentService implements IStudentService{
	@Autowired
private IStudentRepository studentRepo;
	@Override
	public String saveStudent(Student s) {
		Student save = studentRepo.save(s); 
 		return "Student saved havinf ID::"+save.getId();
	}

	@Override
	public String saveAllStudents(List<Student> students) {
		List<Student> saveAll = studentRepo.saveAll(students);
 		return saveAll.size()+" Students records  saved  ";
	}

	@Override
	public List<Student> findAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public String findStudentById(String idVal) {
		Optional<Student> byId = studentRepo.findById(idVal);
		if(byId.isPresent()) {
			return byId.get().toString();
		}
 		return idVal+":: ID not found";
	}

	@Override
	public String deleteStudentById(String idVal) {
		Optional<Student> byId = studentRepo.findById(idVal);
		if(byId.isPresent()) {
			studentRepo.deleteById(idVal);
			return idVal+"::ID deleted Sucessfully";
		}
		return idVal+":: ID not found";
	}

	@Override
	public Long countStudents() {
		long count = studentRepo.count();
 		return count;
	}

	@Override
	public String isStudentExistById(String idVal) {
		boolean existsById = studentRepo.existsById(idVal);
 		if(existsById) return  idVal+"::ID Exist";
 		return idVal+":: ID not found";
	}

	@Override
	public String updateStudent(String idVal) {
		Optional<Student> byId = studentRepo.findById(idVal);
		if(byId.isPresent())
		{
			byId.get().setMarks(99d);
			String id = studentRepo.save(byId.get()).getId();
			return id+"::ID record updated sucessfully";
		}
		return idVal+":: ID not found";
	}

	@Override
	public List<Student> showByDepartment(String department) {
		 List<Student> byDepartment = studentRepo.findByDepartment(department);
		return byDepartment;
	}

	@Override
	public List<Object[]> showByMarksAndDepartment(Double marks, String dept) {
		  List<Object[]> byMarksAndDepartment = studentRepo.getByMarksAndDepartment(marks, dept);
		return byMarksAndDepartment;
	}

}
