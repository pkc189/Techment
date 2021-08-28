package com.techment;

import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTable
{
	JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt)
	{
		this.jt = jt;		
	}
	
	public void createTable()
	{				
		jt.execute("CREATE TABLE Persons1 (\r\n" + 
				"    PersonID int,\r\n" + 
				"    LastName varchar(255),\r\n" + 
				"    FirstName varchar(255),\r\n" + 
				"    Address varchar(255),\r\n" + 
				"    City varchar(255)\r\n" + 
				")");
		// execute() returns void
		System.out.println("table created");
	}
}

