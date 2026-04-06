package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Library;

public interface ILibraryRepository extends JpaRepository<Library,Long> {

}
