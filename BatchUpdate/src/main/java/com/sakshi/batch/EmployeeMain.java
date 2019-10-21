
package com.sakshi.batch;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		for (i = 1; i > 0; i--)
		System.out.println("How many values you want to update");
		{
			int batchNo = scanner.nextInt();
			for (int j = batchNo; j > 0; j--) 
			{
				int employeeId;
				String employeeName;
				String employeeDepartment;
				double empSalary;

				System.out.println("Enter Employee ID");
				employeeId = scanner.nextInt();
				System.out.println("Enter Employee Name");
				employeeName = scanner.next();
				System.out.println("Enter Employee Dept");
				employeeDepartment = scanner.next();
				System.out.println("Enter Employee Salary");
				empSalary = scanner.nextDouble();

				EmployeeDao dao = new EmployeeDao();
				try {
					if (dao.updateEmployee(new Employee(employeeId, employeeName, employeeDepartment, empSalary)))
						System.out.println("-- Employee Details updated successfully --");
					else
						System.out.println("-- Failed to update record --");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}