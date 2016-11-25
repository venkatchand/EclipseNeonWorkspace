package com.touch.point.dbconnection;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DataBaseConnection {

	
	
	public static Connection getConnection()
	{
		
		Connection connection = null;
		Properties props;
		InputStream instr;
		try
		{
			props=new Properties();
			instr=DataBaseConnection.class.getClassLoader().getResourceAsStream("resource/config.properties");
			if(instr != null)
			{
				props.load(instr);
				Class.forName(props.getProperty("dbDriver"));
				connection=DriverManager.getConnection(props.getProperty("dbHost") +"/"+ props.getProperty("dbName"), props.getProperty("dbUsername"),props.getProperty("dbPassword"));
				
				
				return connection;
			}
			else
			{
				
			}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		return connection;
	}
}
