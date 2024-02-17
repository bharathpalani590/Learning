package com.kodnest.createtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetriveDataInJava {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
        String username="root";
        String password="root";
        String query="select * from student";
        try
        {
        	
        	Connection con=DriverManager.getConnection(url, username, password);
        	System.out.println("Connection is established");
        	Statement stmt=con.createStatement();
        	ResultSet rs=stmt.executeQuery(query);
        	System.out.println("Query is executed ");
        	while(rs.next())
        		System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}

}
