package com.sakshi.batch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.sakshi.batch.util.DBUtil;

public class EmployeeDao {

	public boolean updateEmployee(Employee employee) throws SQLException {

		String query ="Update employee SET eName=?, department=?, salary=? WHERE eId=?";
		try (Connection connection = DBUtil.getConnection(); 
				PreparedStatement statement = connection.prepareStatement(query)) {
			

			statement.setInt(4, employee.getId());
			statement.setString(1, employee.getName());
			statement.setString(2, employee.getDept());
			statement.setDouble(3, employee.getSalary());
			statement.addBatch();
			
			
			statement.setInt(4, 2);
			statement.setString(1, employee.getName());
			statement.setString(2, employee.getDept());
			statement.setDouble(3, employee.getSalary());
			statement.addBatch();

			int[] AfterRowsAffected = statement.executeBatch();
//			System.out.println("Rows affected" +AfterRowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
}