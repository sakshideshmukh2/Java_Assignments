package com.sakshi.inheritance.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sakshi.Inheritance.PublicTraining;

public class PublicTrainingTest {

	int noOfParticipants;

	@Test
	public void testExpectedTotalFees() {
		PublicTraining t1 = new PublicTraining();
		t1.setParticipants(noOfParticipants);
		System.out.println(t1.getOrderValue());
		assertEquals(250000.0, t1.getOrderValue(), 0.02);

	}

}
