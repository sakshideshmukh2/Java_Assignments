package com.sakshi.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sakshi.model.Student;
import com.sakshi.util.StudentUtil;

public class StudentMain {

	public static void main(String[] args) {

//		Session session = StudentUtil.getSession();
//		Transaction tx = session.beginTransaction();
//
//		Student student = new Student("Sakshi", "BI", 10000);
//		session.save(student);
//
//		tx.commit();
//		session.close();
//		StudentUtil.closeSessionFactory();
		
		Session session = StudentUtil.getSession();
		Transaction tx = session.beginTransaction();

		Student student = (Student) session.get(Student.class, 1);
		if (student != null)
			student.setStudentFees(15000);

		tx.commit();
		session.close();
		StudentUtil.closeSessionFactory();
}
}