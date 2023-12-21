package com.practice.stockcheck;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;



public class StockCountCheck {
	
public static void main (String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root", "1234");
		
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery("select * from eproduct");
		
		while (rs.next()) 
		{
			int ID= rs.getInt("ID");
			String name =rs.getString("Name");
			int price=rs.getInt("Price");
			Date date_added=rs.getDate("Date_added");
			System.out.println(ID+"  "+name+"   "+price+"    "+ date_added);
		}
		st.close();
		con.close();
	}
}

