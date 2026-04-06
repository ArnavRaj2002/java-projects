package com.nit.sbeans;



public class BookModel {
	private String title;
	private int daysLate;
	private double finePerDay;

	public BookModel(String title, int daysLate, double finePerDay) {
		super();
		this.title = title;
		this.daysLate = daysLate;
		this.finePerDay = finePerDay;
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
