package com.practiceProject.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
	
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ecommerce";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	static {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
	e.printStackTrace();
	}
	}
	public static Connection getConnection() throws SQLException {
	return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
	}
}


