package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lib")
public class Library {
	
private Book book;
@Autowired
@Qualifier("book2")
public void setBook(Book book) {
	this.book = book;
}
public String showBookDetails()
{
	 return book.toString();
}
}
