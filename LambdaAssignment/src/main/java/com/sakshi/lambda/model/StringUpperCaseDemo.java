package com.sakshi.lambda.model;

import java.util.Arrays;
import java.util.List;

public class StringUpperCaseDemo {

	static List<Employee> list = Arrays.asList(
			new Employee("Sakshi", 22, 10000.00),
			new Employee("Diksha", 45, 7000.00),
			new Employee("Dhruv", 38, 9000.00),
			new Employee("Shivam", 12, 8000.00));

	public static void main(String[] args) {
		list.replaceAll(Employee -> {
			Employee.setName(Employee.getName().toUpperCase());
			return Employee;
		});
		
		System.out.println("Names Of Employees in UpperCase" + list);
		// sd.forEach(System.out::println);
	}
}
