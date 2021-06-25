package com.mit.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnexionDB {
	
	public  static Connection CreerConnexion() {
		Connection conn = null;
		String url = "jdbc:mysql://localhost/gestion_compte_bancaire";
		String username = "root";
		String password = "";
		try
		{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url, username, password);
			} 
			catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
		}
		catch (Exception e) 
		{
		e.printStackTrace();	
		}
		
		return conn;
	}

}
