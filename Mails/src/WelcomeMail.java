
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mail.DBconnection;

/**
 * Servlet implementation class WelcomeMail
 */
// @WebServlet("/WelcomeMail")
public class WelcomeMail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WelcomeMail() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String test = request.getParameter("user");
		System.out.println(test);
		out.print("" + "<p align='right'><a href='mails.jsp'>Log out</a> </p>");
		DBconnection db = new DBconnection();
		Map<Integer, Map> getMails = null;
		try {
			getMails = db.getMailsFromDB(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		out.print("cccc<center>" + "<table border='1'>" + "<tr bgcolor='#FF000F'>" + "<th>From Address</th>"
				+ "<th>Message Date</th>" + "<th>Message Subject</th>" + "<th>Message Body</th>" + "</tr>");

		for (Integer i : getMails.keySet()) {
			Map<String, String> mails = getMails.get(i);

			String fromAddress = mails.get("fromAddress");
			String messageDate = mails.get("messageDate");
			String messageSubject = mails.get("messageSubject");
			String messageBody = mails.get("messageBody");

			out.print("<tr>" + "<td>	<center>" + fromAddress + "</center></td>" + "<td>	<center>" + messageDate
					+ "</center></td>" + "<td>	<center>" + messageSubject + "</center></td>" + "<td>	<center>"
					+ messageBody + "</center></td>" + "</tr>");

			System.out.println(fromAddress + " " + messageDate + " " + messageSubject + " " + messageBody);

		}
		out.print("</table>" + "</center>" + "");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String mailcode = request.getParameter("mailcode");
		// out.print("<div style='float:right;'><a href='mails.jsp'>Log out</a>
		// </div>");
		int code = Integer.parseInt(mailcode);
		// if(mailcode.equals("1"))
		// {
		// out.print("Your Inbox messages are....");
		// }
		// else
		// {
		// out.print("Your Draft Messages are....");
		// }
		// System.out.println(mailcode);
		DBconnection db = new DBconnection();
		Map<Integer, Map> getMails = null;
		try {
			getMails = db.getMailsFromDB(code);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		out.print("" + "<table border='0.5' width='100%' border-color='red'>" + "<tr bgcolor='grey'>"
				+ "<th>From Address</th>" + "<th>Message Date</th>" + "<th>Message Subject</th>"
				+ "<th>Message Body</th>" + "</tr>");

		for (Integer i : getMails.keySet()) {
			Map<String, String> mails = getMails.get(i);

			String fromAddress = mails.get("fromAddress");
			String messageDate = mails.get("messageDate");
			String messageSubject = mails.get("messageSubject");
			String messageBody = mails.get("messageBody");

			out.print("<tr>" + "<td>	<center>" + fromAddress + "</center></td>" + "<td>	<center>" + messageDate
					+ "</center></td>" + "<td>	<center>" + messageSubject + "</center></td>" + "<td>	<center>"
					+ messageBody + "</center></td>" + "</tr>");

			// System.out.println(fromAddress+" "+messageDate+"
			// "+messageSubject+" "+messageBody);

		}
		out.print("</table>" + "" + "");
	}

}
