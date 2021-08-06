package com.techment.jdbc;

public class Database {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		JdbcConnection connection = new MySql();
		
		connection.connect();
	}

}
