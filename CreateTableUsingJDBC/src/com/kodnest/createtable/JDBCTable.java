package com.kodnest.createtable;
import java.sql.*;
public class JDBCTable {

	public static void main(String[] args) {
		
				
		        String url="jdbc:mysql://localhost:3306/myjdbcdb";
		        String username="root";
		        String password="root";
		        String query="CREATE TABLE STUDENT(ROLLNO INT,NAME VARCHAR(10))";
		        try
		        {
		        	Class.forName("com.mysql.cj.jdbc.Driver");
		        	System.out.println("Driver loaded Sucesfully");
		        	Connection con=DriverManager.getConnection(url, username, password);
		        	System.out.println("Connection is established");
		        	Statement stmt=con.createStatement();
		        	stmt.execute(query);
		        	System.out.println("Query is executed ");
		        }
		        catch(Exception e)
		        {
		        	e.printStackTrace();
		        }
			}

		}

	


