package com.practice.stockcheck;

import org.testng.annotations.Test;

import com.practiceProject.ecommerce.ProductStockCount;

public class StockCountCheck {
	
	@Test
	public void testCheckStockAvailability() {
	String productName = "Mobile";
	ProductStockCount productDAO = new ProductStockCount();
	int stockQuantity = productDAO.getStockQuantity(productName);
	// Display stock information
	
	System.out.println("| Stock Availability of the selected product|");
	
	System.out.println("| Product Name | Stock Quantity |");
	
	System.out.printf("| %-13s | %-15d |%n", productName, stockQuantity);
	
	}
	}


