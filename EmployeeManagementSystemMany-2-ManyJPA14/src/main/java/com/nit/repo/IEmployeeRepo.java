package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Employe;

public interface IEmployeeRepo extends JpaRepository<Employe,Long> {

}
