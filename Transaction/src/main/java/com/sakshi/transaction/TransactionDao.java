
package com.sakshi.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.sakshi.transaction.dbutil.DBUtil;

public class TransactionDao {

	public boolean updateEmployee(Transaction transaction) throws SQLException {

		String query = "Update transaction SET amount=? WHERE tId=?";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setInt(2, transaction.getTransacionId());
			statement.setDouble(1, transaction.getTransactionAmount());

			int count = statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
//	public boolean addTransaction(Transaction transaction) {
//
//		String query = "INSERT INTO transaction (tName, tFromAccount, tToAccount, tAmount, tDate) VALUES(?, ?, ?, ?, ?)";
//
//		try(Connection connection = DBUtil.getConnection();
//				PreparedStatement statement = connection.prepareStatement(query)) {
//			
//
//			statement.setString(1, transaction.getTransactionName());
//			statement.setLong(2, transaction.getTransactionFromAccount());
//			statement.setLong(3, transaction.getTransactionToAccount());
//			statement.setDouble(4, transaction.getTransactionAmount());
//			statement.setString(5, transaction.getTransactionDate());
//
//			int count = statement.executeUpdate();
//			if (count == 1)
//				return true;
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return false;
//	}
}
