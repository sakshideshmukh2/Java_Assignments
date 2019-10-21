package com.sakshi.student;

public class StudentJDBC {

	public static void main(String[] args) {

		StudentDao dao = new StudentDao();

		if (dao.addStudent(new Student("Sakshi", "Java", 5000)))
			System.out.println("-- Student Record added successfully --");
		else
			System.out.println("-- Failed to add record --");
	}
}
