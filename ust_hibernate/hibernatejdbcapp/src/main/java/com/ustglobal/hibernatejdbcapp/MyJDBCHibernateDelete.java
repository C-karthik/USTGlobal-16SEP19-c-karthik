package com.ustglobal.hibernatejdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class MyJDBCHibernateDelete {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_jdbc?user=root&password=root";
		
		String query = "delete from  employee where empid = ?";
		
		try {
			//load and register
			Driver driver = new Driver();
			DriverManager.deregisterDriver(driver);
			
			//get connection
			
			conn = DriverManager.getConnection(url);
			
			//issue sql query
			
			pstmt = conn.prepareStatement(query);
			
			String empid = args[0];
			
			int id = Integer.parseInt(empid);
			
			pstmt.setInt(1, id);
			
			int count = pstmt.executeUpdate();//prepared statement no need arguments to pass
			
			System.out.println(count);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			
			try {
				
				if(conn != null) {
					conn.close();
				}if(pstmt != null ) {
					
					pstmt.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
