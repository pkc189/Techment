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
		jt.execute("create table sptest(sno int, sname varchar)");
		// execute() returns void
		System.out.println("table created");
	}
}

