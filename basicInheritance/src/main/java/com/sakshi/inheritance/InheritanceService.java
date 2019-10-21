package com.sakshi.inheritance;

public class InheritanceService extends DemoInheritance {

	public static void main(String args[]) {
		DemoInheritance di = new DemoInheritance();
		di.setDate(07);
		di.setMonth(07);
		di.setYear(1991);
		System.out.println(di.getDate() + "/" + di.getMonth() + "/" + di.getYear());

		DemoInheritance di1 = new DemoInheritance();
		di1.setDate(03);
		di1.setMonth(03);
		di1.setYear(2001);
		System.out.println(di1.getDate() + "/" + di1.getMonth() + "/" + di1.getYear());
	}

}