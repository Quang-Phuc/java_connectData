package com.ketnoi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnet {
	Connection conn=null;
	String url = "jdbc:mysql://localhost:3306/demo";
	String username="root";
	String pass="123456";
	public Connection Ketnoi()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,username,pass);
		if(conn !=null)
				{
						System.out.println("Ket noi thanh cong");
				}
				
			
		}
		catch(ClassNotFoundException e)
		{
				System.out.println("Load k thanh cong");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Loi :"+e.getMessage());
		}
		return conn;
	}
	

}
