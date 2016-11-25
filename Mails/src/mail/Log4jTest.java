package mail;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4jTest {
	
	Logger log=Logger.getLogger(Log4jTest.class.getName());

	public static void main(String args[]) throws Exception
	{
//		initLogger();
		Log4jTest test=new Log4jTest();
		test.loggerMail();
		
	}
	
	public  void loggerMail() throws  Exception
	{
		
		Properties logProperties=new Properties();
		logProperties.load(new FileInputStream("F:/EclipseNeonWorkspace/Mails/WebContent/WEB-INF/lib/log4j.properties"));
		PropertyConfigurator.configure(logProperties);
		log.info("Logger initialized......");
				
	}
}
