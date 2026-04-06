package com.nit.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.Book;
import com.nit.sbeans.Library;

@Configuration
@ComponentScan(basePackages="com.nit.sbeans")
public class AppConfig {

	@Bean(name="book")
	public Book setBookFields() {
		 Book book = new Book();
		 book.setAuthor("James");
		 book.setTitle("java");
		 return book;
	}
	@Bean(name="book2")
	public Book setBookFields1() {
		Book book=new Book();
		book.setAuthor("Dennis");
		book.setTitle("C-Lang");
		return book;
	}
	@Bean(name="lib")
	public Library setLibrary() {
		Library lib= new Library();
		lib.setBook(setBookFields());
		return lib;
	}
	
//	
  
	
}
