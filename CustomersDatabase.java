package CustomersDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Customers.Customers;

public class CustomersDatabase {

	public static void addCustomer(Customers customer) {

		int customerId = customer.getCustomerId();
		String customerFirstName = customer.getCustomerFirstName();
		int contactId = customer.getCustomerContactPersonId();

		Connection dbConnection = null;
		Statement statement = null;
		
		try {

			// DB connection (access to DB)
			dbConnection = DriverManager.getConnection("jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7268655",
			"sql7268655", "SZ6BcHB1l4");

			String sql = "INSERT INTO Customers (Id, FirstName, ContactPersonId VALUES (?,?,?)";

			// Create prepared statement for values
			PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
			preparedStatement.setInt(1, customerId);
			preparedStatement.setString(2, customerFirstName);
			preparedStatement.setInt(3, contactId);
		
			// Execute prepared statement
			preparedStatement.execute();
			
			// Create object for DB connection
			statement = dbConnection.createStatement();
			
			statement.executeQuery(sql);

		} catch (SQLException sqlE) {
			sqlE.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException secondSqlE) {
			}
			try {
				if (dbConnection != null)
					dbConnection.close();
			} catch (SQLException sqlE) {
				sqlE.printStackTrace();
			}
		}
	}

	public static void getCustomer() {

		Connection dbConnection = null;
		Statement statement = null;
		
		try {

			// DB connection (access to DB)
			dbConnection = DriverManager.getConnection("jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7268655",
			"sql7268655", "SZ6BcHB1l4");

			statement = dbConnection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Customers");

			while (resultSet.next())
				System.out.println(resultSet.getString(1) + "  " + resultSet.getString(2) + "  " + resultSet.getString(3));

		} catch (SQLException sqlE) {
			sqlE.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException secondSqlE) {
			}
			try {
				if (dbConnection != null)
					dbConnection.close();
			} catch (SQLException sqlE) {
				sqlE.printStackTrace();
			}
		}
	}
}
