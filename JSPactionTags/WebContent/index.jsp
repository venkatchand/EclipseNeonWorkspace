<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="objv" class="com.jspTest.cube" ></jsp:useBean>
<jsp:useBean id="bean" class="com.jspTest.BeanTest" scope="session"></jsp:useBean>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>index page</h2>
<%! int a=2;
%>
<%
if(a==2)
{%>
u are not forwarded....


<%
}else
{
	
%>
<jsp:forward page="forwardPage.jsp"></jsp:forward>
<%
}
%>

<jsp:include page="includePage.jsp"></jsp:include>

<% int cube=objv.cube(5);
out.println("Cube of 5:: "+cube);
%>
<form action="beanProcess.jsp">
Enter name : <input type="text" name="name"/>
<input type="submit" value="go"/>
<jsp:setProperty property="email" name="bean" value="email"/>
</form>


</body>
</html>