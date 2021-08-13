package com.techment.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnectionDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class found");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:5000/techment?autoReconnect=true&useSSL=false", "root", "Bodygaurd@2013");

			System.out.println("Connected");
			Statement stmt = con.createStatement();

			//stmt.execute("insert into employee values(2,'sachin',34000)");
     ResultSet rs = stmt.executeQuery("select * from employee");
 while(rs.next())
 {
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
 }

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
