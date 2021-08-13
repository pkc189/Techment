package com.techment.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class found");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:5000/techment?autoReconnect=true&useSSL=false", "root", "Bodygaurd@2013");

			System.out.println("Connected");
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of employees ");
			int numbOfEmployees = scanner.nextInt();

			for (int i = 0; i < numbOfEmployees; i++) {
				System.out.println("Enter id ");
				int id = scanner.nextInt();

				System.out.println("Enter name ");
				String name = scanner.nextLine();
				name+=scanner.nextLine();
              // scanner.close();
				System.out.println("Enter Salary ");
				int salary = scanner.nextInt();

				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, salary);

				ps.execute();

			}

			System.out.println("inserted");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
