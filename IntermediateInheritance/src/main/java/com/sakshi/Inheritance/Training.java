package com.sakshi.Inheritance;

public class Training {

	int id;
	String subject;
	double fees;

	public Training() {
		super();
	}

	public Training(int id, String subject, double fees) {
		super();
		this.id = id;
		this.subject = subject;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {

		return subject;
	}

	public void setSubject(String subject) {
		this.subject = "Big Data";
	}

	public double getFees() {
		return fees = 35000;
	}

	public void setFees(double fees) {
		this.fees = 35000;
	}

}
