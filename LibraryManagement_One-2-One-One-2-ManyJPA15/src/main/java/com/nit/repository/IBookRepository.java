package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Book;

public interface IBookRepository extends JpaRepository<Book,Long> {

}
