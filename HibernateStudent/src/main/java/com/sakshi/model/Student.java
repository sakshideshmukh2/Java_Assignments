package com.sakshi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "Student_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	@Column(name = "Student_Name")
	private String studentName;
	@Column(name = "Student_Course")
	private String studentCourse;
	@Column(name = "Student_fees")
	private double studentFees;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public double getStudentFees() {
		return studentFees;
	}
	public void setStudentFees(double studentFees) {
		this.studentFees = studentFees;
	}
	public Student(int studentId, String studentName, String studentCourse, double studentFees) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCourse = studentCourse;
		this.studentFees = studentFees;
	}
	
	public Student(String studentName, String studentCourse, double studentFees) {
		super();
		this.studentName = studentName;
		this.studentCourse = studentCourse;
		this.studentFees = studentFees;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCourse=" + studentCourse
				+ ", studentFees=" + studentFees + "]";
	}
	
	
}