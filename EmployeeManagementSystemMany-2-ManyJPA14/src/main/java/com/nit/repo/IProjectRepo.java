package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Project;

public interface IProjectRepo extends JpaRepository<Project, Long> {

}
