package com.techment.jdbc;

public class MySql implements JdbcConnection {

	@Override
	public void connect() {
		System.out.println("My sql connect");

	}

}
