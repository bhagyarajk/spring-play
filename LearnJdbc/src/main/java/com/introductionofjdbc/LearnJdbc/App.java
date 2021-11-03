package com.introductionofjdbc.LearnJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Hello World!");

		// Load and register the driver
		Class.forName("com.mysql.jdbc.Driver");

		// Establish the connection
		Connection connection = DriverManager.getConnection("jdbc.mysql://localhost:3306/devdb", "root", "root");

		// Statement Object
		Statement statement = connection.createStatement();

		// Resultset

		ResultSet resultSet = statement.executeQuery("select * from devdb");

		// Process the results, which you got in resultset

		while (resultSet.next()) {

			System.out.println(resultSet);
		}

	}
}
