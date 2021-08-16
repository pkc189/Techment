package com.techment.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ReteriveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter id to fetch ");
		int id = scanner.nextInt();

		try {
			Connection con = DriverManager.getConnection(ConnectionProperty.URL,ConnectionProperty.USERNAME,ConnectionProperty.PASSWORD);

			PreparedStatement ps = con.prepareStatement("select * from employee where id =?");
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt(1));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
