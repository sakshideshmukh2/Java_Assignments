package com.sakshi.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sakshi.model.Employee;
import com.sakshi.util.HibernateUtil;

class EmployeeMain {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Employee employee = new Employee("Sakshi", "IT", 34000);
		session.save(employee);

		tx.commit();
		session.close();
		HibernateUtil.closeSessionFactory();

//		Session session2 = HibernateUtil.getSession();
//
//		Employee employee1 = (Employee) session2.load(Employee.class, 2);
//		System.out.println("Hey");
//		System.out.println(employee1);
//
//		session2.close();
//		HibernateUtil.closeSessionFactory();
//
//		Session session3 = HibernateUtil.getSession();
//		Transaction tx2 = session.beginTransaction();
//
//		Employee employee2 = (Employee) session3.get(Employee.class, 1);
//		if (employee2 != null)
//			employee2.setEmployeeSalary(45000);
//
//		tx2.commit();
//		session.close();
//		HibernateUtil.closeSessionFactory();
//
//		Session session4 = HibernateUtil.getSession();
//		Transaction tx3 = session4.beginTransaction();
//
//		Employee employee3 = (Employee) session4.get(Employee.class, 1);
//		if (employee3 != null)
//			session.delete(employee3);
//
//		tx3.commit();
//		session.close();
//		HibernateUtil.closeSessionFactory();
 	}
}
