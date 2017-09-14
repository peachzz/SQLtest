package com.terry.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAPI {

	private static final String user ="用户名";
	private static final String psw ="ueekmwvdyhecg";
	private static final String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";//net.sourceforge.jtds.jdbc.Driver
	private static final String dbUrl= "jdbc:sqlserver://ip;DatabaseName=数据库;";
	
	private static Connection con = null;
	static{
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(dbUrl,user,psw);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection(){
		return con;
	}
}
