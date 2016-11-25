import java.sql.*;
import java.util.HashMap;
import java.util.Map;

import com.mysql.jdbc.Connection;

public class DBconnection2 {

	Connection connection = null;
	Statement statement = null;

	void dbConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mail", "root", "root");

		statement = connection.createStatement();
	}

	public Map<Integer, Map> getUsersFromDB() throws Exception {

		dbConnection();
		String username, password;
		Map<Integer, Map> userList = new HashMap<Integer, Map>();

		ResultSet resultset = statement.executeQuery("select * from logindetail;");
		int n = 1;
		while (resultset.next()) {
			username = resultset.getString("username");
			password = resultset.getString("mpassword");

			Map<String, String> userlist = new HashMap<String, String>();
			userlist.put("username", username);
			userlist.put("password", password);

			userList.put(n, userlist);
			n++;
		}
		resultset.close();
		statement.close();
		connection.close();
		return userList;

	}

	public Map<Integer, Map> getMailsFromDB() throws Exception {
		dbConnection();
		String fromAddress, messageSubject, messageBody;
		Date messageDate;

		Map<Integer, Map> mailsList = new HashMap<Integer, Map>();

		ResultSet resultset = statement.executeQuery("select * from mails;");
		int n = 1;
		while (resultset.next()) {
			fromAddress = resultset.getString("from_address");
			messageDate = resultset.getDate("message_date");
			messageSubject = resultset.getString("message_subject");
			messageBody = resultset.getString("message_body");

			Map<String, String> mailslist = new HashMap<String, String>();
			mailslist.put("fromAddress", fromAddress);
			mailslist.put("messageDate", messageDate.toString());
			mailslist.put("messageSubject", messageSubject);
			mailslist.put("messageBody", messageBody);

			mailsList.put(n, mailslist);
			n++;
		}
		resultset.close();
		statement.close();
		connection.close();
		return mailsList;
	}

	public static void main(String args[]) throws Exception {
		DBconnection2 db = new DBconnection2();
		Map<Integer, Map> userList = db.getUsersFromDB();

		for (Integer i : userList.keySet()) {
			Map<String, String> users = userList.get(i);

			String mUsername = users.get("username");
			String mPassword = users.get("password");

			System.out.println(mPassword + " " + mPassword);
		}
		System.out.println("**********************************************");

		Map<Integer, Map> getMails = db.getMailsFromDB();

		for (Integer i : getMails.keySet()) {
			Map<String, String> mails = getMails.get(i);

			String fromAddress = mails.get("fromAddress");
			String messageDate = mails.get("messageDate");
			String messageSubject = mails.get("messageSubject");
			String messageBody = mails.get("messageBody");

			System.out.println(fromAddress + " " + messageDate + " " + messageSubject + " " + messageBody);

		}

		System.out.println("**********************************************");

	}

}
