package com.DB;
import java.sql.*;

public class DBConnect {
	
	private static Connection conn;
	
	public static Connection getConn()
	{
		try {
			if(conn==null)
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Job_portal1","root","Ankita#98@11");
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		return conn;
	}

}
