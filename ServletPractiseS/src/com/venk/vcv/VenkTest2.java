package com.venk.vcv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VenkTest
 */
// @WebServlet("/VenkTest")
public class VenkTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public VenkTest2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request , HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		
//		response.sendError(403, "No Aut found");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String str=request.getParameter("MyEmail");
		
		out.println("hello ji : "+str);
		System.out.println("VenkTest2.java");

		/*Enumeration para = request.getParameterNames();

		while (para.hasMoreElements()) {

			String paraStr = (String) para.nextElement();
			String[] paraVal = request.getParameterValues(paraStr);

			out.println("Value of  '" + paraStr + "'  tag : " + paraVal[0] + "<br/>");

		}

		// Methods TO Read Http Header
		System.out.println("Servlet Name : " + getServletName());
		System.out.println("Servlet Info :" + getServletInfo());
		System.out.println("Remote Address : " + request.getRemoteHost() + " : " + request.getRemotePort() + " : "
				+ request.getRemoteUser());
		System.out.println("locale : " + request.getLocale());
		System.out.println("cookies : " + request.getCookies());
		System.out.println("Session : " + request.getSession());
		System.out.println("Content type : " + request.getContentType());
		System.out.println("Context path  : " + request.getContextPath());
		System.out.println("Method of This Request  : " + request.getMethod());
		System.out.println("ServletPath : " + request.getServletPath());
		System.out.println("ServerPort  : " + request.getServerPort());
		System.out.println("IsSecure  : " + request.isSecure());
*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
