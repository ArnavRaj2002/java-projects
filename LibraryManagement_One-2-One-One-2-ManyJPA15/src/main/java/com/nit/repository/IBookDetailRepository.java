package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.BookDetail;

public interface IBookDetailRepository extends JpaRepository<BookDetail,Long>{

}
