<%@ page  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Process Page</title>
</head>
<body>
<%
String s1=request.getParameter("n1");
String s2=request.getParameter("n2");

int a1 = Integer.parseInt(s1);
int a2 = Integer.parseInt(s2);
int c=a1/a2;

out.print("Divided number is : "+c);


%>
</body>
</html>