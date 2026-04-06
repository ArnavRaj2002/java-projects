package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.University;

public interface IUniversityRepository extends JpaRepository<University,Long>{

}
