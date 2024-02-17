package com.kodnest.createtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTable {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
        String username="root";
        String password="root";
        String query="update student set name='Arjun' where rollno=2";
        try
        {
        	
        	Connection con=DriverManager.getConnection(url, username, password);
        	System.out.println("Connection is established");
        	Statement stmt=con.createStatement();
        	stmt.executeUpdate(query);
        	System.out.println("Query is executed ");
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }

	}

}
