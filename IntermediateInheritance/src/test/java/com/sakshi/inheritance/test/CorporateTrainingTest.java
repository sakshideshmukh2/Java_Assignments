package com.sakshi.inheritance.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sakshi.Inheritance.CorporateTraining;
import com.sakshi.Inheritance.PublicTraining;

public class CorporateTrainingTest {

	int noOfDays;

	@Test
	public void testExpectedTotalFees() {
		CorporateTraining t2 = new CorporateTraining();
		t2.setDays(noOfDays);
		System.out.println(t2.getOrderValue());
		assertEquals(140000.0, t2.getOrderValue(), 0.02);

	}
}
