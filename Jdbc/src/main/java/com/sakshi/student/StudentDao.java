package com.sakshi.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sakshi.student.dbutil.DBUtil;

public class StudentDao {

	
	public boolean addStudent(Student student) {

		String query = "INSERT INTO Student (studentName, studentCourse, studentFees) VALUES(?, ?, ?)";

		try(Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {
			

			statement.setString(1, student.getName());
			statement.setString(2, student.getCourse());
			statement.setDouble(3, student.getFees());

			int count = statement.executeUpdate();
			if (count == 1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
