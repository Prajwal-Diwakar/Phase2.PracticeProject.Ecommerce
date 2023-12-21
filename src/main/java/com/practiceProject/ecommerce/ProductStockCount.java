package com.practiceProject.ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductStockCount {
	
	
	public int getStockQuantity(String productName) {
		
	int stockQuantity = 0;
	try (Connection connection = DatabaseConnector.getConnection()) {
	String sql = "SELECT stock_quantity FROM products WHERE product_name = ?";
	try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	preparedStatement.setString(1, productName);
	ResultSet resultSet = preparedStatement.executeQuery();
	if (resultSet.next()) {
	stockQuantity = resultSet.getInt("stock_quantity");
	}
	}
	} catch (SQLException e) {
	e.printStackTrace();
	}
	return stockQuantity;
	}
}



