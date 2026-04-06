package com.nit.sbeans;

public class Library {
 private Book book1; //HAS-A
 private Book book2;
 private Book book3;
public Book getBook1() {
	return book1;
}
public void setBook1(Book book1) {
	this.book1 = book1;
}
public Book getBook2() {
	return book2;
}
public void setBook2(Book book2) {
	this.book2 = book2;
}
public Book getBook3() {
	return book3;
}
public void setBook3(Book book3) {
	this.book3 = book3;
}
 public String displayBooks() {
	 return "Book1 [author : "+book1.getAuthor()+" , title :"+book1.getTitle()+"]\nBook2 [author : "+book2.getAuthor()+" , title :"+book2.getTitle()+"]\nBook3 [author : "+book3.getAuthor()+" , title :"+book3.getTitle()+"]";
 }
}
