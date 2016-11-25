package mail;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;



import com.mysql.jdbc.Connection;

public class DBconnection extends DBproperty {
	
	Connection connection=null;
	Statement statement =null;
	
//	Log4jTest log4js=new Log4jTest();
	
//	Logger log=Logger.getLogger(Log4jTest.class.getName());
	void dbConnection() throws Exception
	{
//		log4js.loggerMail();

		loadProperty();
		Class.forName(driverLoader);
		connection=(Connection) DriverManager.getConnection(url,username,password);
		
		statement  = connection.createStatement();
		log.info("DB connected..");
	}

	public Map<Integer,Map> getUsersFromDB() throws Exception
	{
		
		dbConnection();
		String username,password;
		Map<Integer,Map> userList=new HashMap<Integer, Map>();
		
		ResultSet resultset=statement.executeQuery("select * from logindetail;");
		int n=1;
		while(resultset.next())
		{
			username=resultset.getString("username");
			password=resultset.getString("mpassword");
			
			Map<String,String> userlist=new HashMap<String,String>();
			userlist.put("username", username);
			userlist.put("password", password);
			
			userList.put(n, userlist);
			n++;
		}
		resultset.close();
		statement.close();
		connection.close();
		log.info("Username fectched from DB");
		return userList;
		
	}
	
	public Map<Integer, Map> getMailsFromDB(int mailCode) throws Exception
	{
		dbConnection();
		String fromAddress,messageSubject,messageBody;
		Date messageDate;
		
		Map<Integer, Map> mailsList=new HashMap<Integer,Map>();
		
		ResultSet resultset = statement.executeQuery("select * from mails where mail_id="+mailCode+";");
		int n=1;
		while(resultset.next())
		{
			fromAddress=resultset.getString("from_address");
			messageDate=resultset.getDate("message_date");
			messageSubject=resultset.getString("message_subject");
			messageBody=resultset.getString("message_body");
			
			
			Map<String,String> mailslist=new HashMap<String,String>();
			mailslist.put("fromAddress", fromAddress);
			mailslist.put("messageDate",messageDate.toString());
			mailslist.put("messageSubject", messageSubject);
			mailslist.put("messageBody", messageBody);
			
			mailsList.put(n, mailslist);
			n++;
		}
		resultset.close();
		statement.close();
		connection.close();
		log.info("mails fectched from DB");
		return mailsList;
	}
	public static void main(String args[]) throws Exception 
	{
		DBconnection db=new DBconnection();
		Map<Integer,Map> userList=db.getUsersFromDB();
		
		for(Integer i: userList.keySet())
		{
			Map<String,String> users=userList.get(i);
			
			String mUsername=users.get("username");
			String mPassword=users.get("password");
			
			System.out.println(mPassword+" "+mPassword);
		}
		System.out.println("**********************************************");
		
		Map<Integer,Map> getMails=db.getMailsFromDB(1);
		
		for(Integer i : getMails.keySet())
		{
			Map<String,String> mails=getMails.get(i);
			
			String fromAddress=mails.get("fromAddress");
			String messageDate=mails.get("messageDate");
			String messageSubject=mails.get("messageSubject");
			String messageBody=mails.get("messageBody");
			
			System.out.println(fromAddress+" "+messageDate+" "+messageSubject+" "+messageBody);
			
			
			
		}
			
		System.out.println("**********************************************");
		
	}
	
}
