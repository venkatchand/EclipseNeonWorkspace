package mail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;

public class DBproperty extends Log4jTest {

	String url,driverLoader,username,password;
//	Logger log=Logger.getLogger(Log4jTest.class.getName());
	public void loadProperty() throws Exception
	{
		Properties properties=new Properties();
		FileInputStream fileInputStream=new FileInputStream("F:/EclipseNeonWorkspace/Mails/db.properties");
		properties.load(fileInputStream);
		
		url=properties.getProperty("url");
		driverLoader=properties.getProperty("driverloader");
		username=properties.getProperty("username");
		password=properties.getProperty("password");
		log.info("DB property loaded");
	}
	
	public static void main(String args[]) throws Exception
	{
		
		DBproperty dp=new DBproperty();
		dp.loadProperty();
	}
}
