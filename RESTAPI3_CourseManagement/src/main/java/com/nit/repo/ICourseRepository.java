package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Course;

public interface ICourseRepository extends JpaRepository<Course, Integer> {

}
