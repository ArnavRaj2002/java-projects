package com.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.repository.IBookDetailRepository;
import com.nit.repository.IBookRepository;
import com.nit.repository.ILibraryRepository;

@SpringBootApplication
public class LibraryManagementOneToOneOneToManyJpa15Application {
	@Autowired
	private IBookRepository book;
	@Autowired
	private IBookDetailRepository bookDetails;
	@Autowired
	private ILibraryRepository library;

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication
				.run(LibraryManagementOneToOneOneToManyJpa15Application.class, args);
		

	}

}
