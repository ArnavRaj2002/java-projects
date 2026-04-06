package com.nit.sbeans;

import org.springframework.stereotype.Component;

 
public class Book {
	private String title="spring";
	private String author="rhode";

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String toString() {
		return "Title : " + title + "\n Author : " + author;
	}

}
