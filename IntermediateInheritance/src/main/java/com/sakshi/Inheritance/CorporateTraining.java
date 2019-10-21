
package com.sakshi.Inheritance;

public class CorporateTraining extends Training {

	private int days;

	public CorporateTraining() {
		super();
	}

	public CorporateTraining(int id, String subject, double fees, int days) {
		super(id, subject, fees);
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = 4;
	}

	public double getOrderValue() {
		return getFees() * days;
	}

}