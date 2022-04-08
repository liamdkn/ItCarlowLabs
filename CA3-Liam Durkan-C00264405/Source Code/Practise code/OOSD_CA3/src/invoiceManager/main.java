package invoiceManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {

	public static void main(String[] args) {
		String jdbcURL = "jdbc:mysql://localhost:3306/InvoiceManagement";
		String username = "root";
		String password = "password";
		
		String firstName = "John1";
		String lastName = "Doe";
		String phone = "0987654321";
		String email = "johndoe@gmail.com";
		String street = "1 ave grove";
		String county = "Meath";
		String postcode = "C13 4rr2";
		
	
		
		insertCustomer(jdbcURL,username,password,firstName,lastName,phone,email,street,county,postcode);
		retrieveCustomer(jdbcURL,username,password);
		//updateCustomer();
	}	

	
	

	
	//method to insert into customer table
	private static void insertCustomer(String jdbcURL, String username, String password, String firstName,
			String lastName, String phone, String email, String street, String county, String postcode) {
		
		try {
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
			
			if(connection != null) {
				
				String sql = "INSERT INTO customer (firstName,lastName,phone,email,street,county,postcode)"
						+ " VALUES (?,?,?,?,?,?,?)";
				
				PreparedStatement statement = connection.prepareStatement(sql);
				statement.setString(1,  firstName);
				statement.setString(2,  lastName);
				statement.setString(3,  phone);
				statement.setString(4,  email);
				statement.setString(5,  street);
				statement.setString(6,  county);
				statement.setString(7,  postcode);
				
				int rows = statement.executeUpdate();
				
				if(rows > 0) {
					System.out.println("A new Customer has been inserted sucessfully.");
				}
			connection.close();
			}
			
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	
	//method to Retrieve from table
	private static void retrieveCustomer(String jdbcURL, String username, String password) {
		
		try {
			Connection connection = DriverManager.getConnection(jdbcURL,username,password);
			
			String sql = "SELECT * FROM customer";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				String firstName = result.getString(2);
				
				System.out.println(firstName);
			}
			
			
			
			
			}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	
	
	
	
	
}