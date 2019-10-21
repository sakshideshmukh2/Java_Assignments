package com.sakshi.inheritance;

public class DemoInheritance {
	private int date;
	private int month;
	private int year;

	public DemoInheritance(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public DemoInheritance() {
	}

	public int getDate() {
		return date;
	}

	public int setDate(int date) {
		this.date = date;
		return this.date;
	}

	public int getMonth() {
		return month;
	}

	public int setMonth(int month) {
		this.month = month;
		return this.month;
	}

	public int getYear() {
		return year;
	}

	public int setYear(int year) {
		this.year = year;
		return this.year;
	}

	@Override
	public String toString() {
		return "DemoInheritance [date=" + date + ", month=" + month + ", year=" + year + "]";
	}

}
