

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import mail.DBconnection;
import mail.Log4jTest;

/**
 * Servlet implementation class LoginValidation
 */
//@WebServlet("/LoginValidation")
public class LoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Log4jTest log4js=new Log4jTest();

	Logger log=Logger.getLogger(Log4jTest.class.getName());
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hi");
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try {
			log4js.loggerMail();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Boolean mailUser=false;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		log.info("User Entered Username : '"+username+"' and Password : '"+password +"'");
		DBconnection db=new DBconnection();
		try {
			Map<Integer,Map> userList=db.getUsersFromDB();
			
			for(Integer i: userList.keySet())
			{
				Map<String,String> users=userList.get(i);
				
				String mUsername=users.get("username");
				String mPassword=users.get("password");
				
				if(username.equals(mUsername)&& password.equals(mPassword))
				{
					mailUser=true;
					log.info("Username and password matched in DB");
				}
				else
				{
					//mailUser=false;
				}
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (mailUser==true)
		{
//			out.println("Your username and password is correct");
//			response.sendRedirect("WelcomeMail");
			response.sendRedirect("mailInbox.jsp");
			log.info("User logged in....");
			
		}
		else
		{
//			response.sendRedirect(getServletName());
			out.println("Your username and password is not correct");
			log.info("Your username and password is not correct");
			out.println("</br></br>"
					+ "<pre>   <a href='mails.jsp'>Log In</a> ");
		}
		out.close();
			
	}

}
