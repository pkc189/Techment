package com.techment.jdbc;

public class Oracle implements JdbcConnection {

	@Override
	public void connect() {

  System.out.println("Oracle Connection");
	}

}
