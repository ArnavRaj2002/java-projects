package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component


public class BookModel {
	private String title;
	private int daysLate;
	private double finePerDay;

	public BookModel(String title, int daysLate, double finePerDay) {
		super();
		System.out.println("BookModel.BookModel()::param-const");
		this.title = title;
		this.daysLate = daysLate;
		this.finePerDay = finePerDay;
	}
	public  BookModel()
	{
		System.out.println("BookModel.::0-arg");
	}
	public String getTitle() {
		return title;
	}

	public int getDaysLate() {
		return daysLate;
	}

	public double getFinePerDay() {
		return finePerDay;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDaysLate(int daysLate) {
		this.daysLate = daysLate;
	}

	public void setFinePerDay(double finePerDay) {
		this.finePerDay = finePerDay;
	}

	@Override
	public String toString() {
		return "BookModel [title=" + title + ", daysLate=" + daysLate + ", finePerDay=" + finePerDay + "]";
	}

}
