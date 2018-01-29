package com.ketnoi;
import java.sql.*;

import com.ketnoi.DBConnet;

public class Hienthi {
	Connection conn=null;
	PreparedStatement pt= null;
	DBConnet kn= new DBConnet();
	public void Display()
	{
		conn=kn.Ketnoi();
		String sql ="select * from user ";
		try {
			pt=conn.prepareStatement(sql);
			ResultSet rs= pt.executeQuery();
			while(rs.next())
			{
				String name=rs.getString("name");
				String pass=rs.getString("pass");
				System.out.println(" "+name);
				System.out.println("  "+pass);
				
			}
			
		} catch (SQLException e) {
			
			System.out.println("Loi"+e.getMessage());
		}
		
	}

}
