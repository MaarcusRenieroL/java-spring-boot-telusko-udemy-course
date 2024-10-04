package com.maarcus;

// Step 1: Import the package
import java.sql.*;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:postgresql://localhost:5432/db";
		String user = "postgres";
		String password = "postgres";
		String query = "select name from students";
		
		// Step 2: Load and Register Driver
		Class.forName("org.postgresql.Driver");
		
		// Step 3: Create connection
		Connection connection = DriverManager.getConnection(url, user, password);
		
		// Step 4: Create statement
		Statement statement = connection.createStatement();
		
		PreparedStatement preparedStatement = connection.prepareStatement("insert into students values(?, ?)");
		preparedStatement.setInt(1, 4);
		preparedStatement.setString(2, "Test");
		
		preparedStatement.execute();
		
		// Step 5: Execute statement
		ResultSet resultSet = statement.executeQuery(query);
		
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1));
		}
		
		// Step 6: Close
		statement.close();
	}
}