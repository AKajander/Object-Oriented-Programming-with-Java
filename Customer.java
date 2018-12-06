import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private int postalCode;
	private int storeCode;
	private int contactPersonId;
	
	public Customer() {
		this.storeCode = 100;
		this.contactPersonId = 100;
	}
	
	public Customer(int id, String firstName, String lastName, int postalCode, int storeCode, int contactPersonId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.postalCode = postalCode;
		this.storeCode = storeCode;
		this.contactPersonId = contactPersonId;
	}
	
	public int getCustomerId() {
		return id;
	}
	
	public String getCustomerFirstName() {
		return firstName;
	}
	
	public int getContactPersonId() {
		return contactPersonId;
	}
	
	public void setCustomerId(int id) {
		this.id = id;
	}
	
	public void setCustomerFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setCustomerLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setCustomerPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	public void setCustomerStoreCode(int storeCode) {
		this.storeCode = storeCode;
	}
	
	public void setCustomerContactPersonId(int contactPersonId) {
		this.contactPersonId = contactPersonId;
	}
	
	public String toString() {
		String printableText = "Customer's first name is: " + this.getCustomerFirstName()
		+ " and customer's contact person (id) is: " + this.getContactPersonId();
		
		return printableText;
	}
	
	public static void main(String[] args) {
		
		
		
		public static void addCustomer(Customer customer) {
			
			int id = customer.getCustomerId();
			String firstName = customer.getCustomerFirstName();
			int contactPersonId = customer.getContactPersonId();
			
			Connection dbConnection = null;
			Statement statement = null;
			
			try {

				// DB connection (access to DB)
				dbConnection = DriverManager.getConnection("jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7268655",
						"sql7268655", "SZ6BcHB1l4");

				// Create ResultSet object for SQL query
				String sql = "INSERT INTO Customers (Id, FirstName, ContactPersonId VALUES (1,2,3)";
				
				// Create prepared insert statement
				PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, firstName);
				preparedStatement.setInt(3, contactPersonId);
				
				// Execute prepared statement
				preparedStatement.execute();
				
				// Create object for DB connection
				statement = dbConnection.createStatement();
				
				statement.executeQuery(sql);

				// Handle exceptions and print possible exceptions into console
			} catch (SQLException sqlE) {
				sqlE.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (statement != null) {
						statement.close();
					}
				} catch (SQLException secondSqlE) {
					
				}
				
				try {
					if (dbConnection != null) {
						dbConnection.close();
					}
				} catch (SQLException thirdSqlE) {
					thirdSqlE.printStackTrace();
				}
			}
		}
		
	}
}
