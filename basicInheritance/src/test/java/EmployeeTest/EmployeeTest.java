package EmployeeTest;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.sakshi.employee.Employee;

public class EmployeeTest {
	Scanner sc = new Scanner(System.in);
	int empId;
	String empName;
	double basicSal;
	double Medical;

	@Before
	public void InputDetails() {
		System.out.println("Enter Employee ID");
		empId = sc.nextInt();
		System.out.println("Enter Employee Name");
		empName = sc.next();
		System.out.println("Enter Employee Salary");
		basicSal = sc.nextDouble();
		System.out.println("Enter Employee Medical");
		Medical = sc.nextDouble();

	}

	@Test
	public void TestDetails() {
		final Employee emp = new Employee();
		emp.setEmployeeId(empId);
		emp.setEmployeeName(empName);
		emp.setBasicSalary(basicSal);
		emp.setHra(basicSal);
		emp.setMedical(Medical);
		emp.setPf(basicSal);
		emp.setPt(200);
		emp.setGrossSalary();
		emp.setNetSalary(Medical);

		assertEquals(emp.getEmployeeId(), empId);
		assertEquals(emp.getEmployeeName(), empName);
		assertEquals(emp.getBasicSalary(), basicSal, 0.002);
		assertEquals(emp.getMedical(), Medical, 0.002);
		assertEquals(emp.getPf(), emp.setPf(basicSal), 0.002);
		assertEquals(emp.getGrossSalary(), emp.setGrossSalary(), 0.002);
		assertEquals(emp.getNetSalary(), emp.setNetSalary(Medical), 0.002);
		System.out.println("empId" + emp.getEmployeeId() + "empName" + emp.getEmployeeName() + "basicSal"
				+ emp.getBasicSalary() + "Medical" + emp.getMedical() + "PF" + emp.getPf() + "Gross Salary"
				+ emp.getGrossSalary() + "Net Salary" + emp.getNetSalary());
	}

}
