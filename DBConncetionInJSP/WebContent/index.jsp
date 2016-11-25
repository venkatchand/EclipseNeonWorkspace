<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.io.*,java.util.*,java.sql.*"%>
<%-- 
<%@ taglib uri="https://java.sun.com/jsp/jstl/core"  prefix="c" %> 
<%@ taglib uri="https://java.sun.com/jsp/jstl/sql"   prefix="sql" %>   
    --%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DB Connection on JSP</title>
</head>

<sql:setDataSource var="venki" driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost/test" user="root" password="root" />

<sql:update dataSource="${venki}" var="result">
	delete from vcv where id=77; 
</sql:update>

<sql:query dataSource="${venki}" var="result">
	select * from vcv;
</sql:query>

<p>Original Table</p>
<table border="1" width="100%">
	<tr>
		<th>id</th>
		<th>name</th>
		<th>address</th>
	</tr>

	<c:forEach var="row" items="${result.rows }">
		<tr>
			<td><center>
					<c:out value="${row.id }" />
				</center></td>
			<td><center>
					<c:out value="${row.name }" />
				</center></td>
			<td><center>
					<c:out value="${row.address }" />
				</center></td>
		</tr>
	</c:forEach>
	</table>
<p>After Insertion of id : 77</p>



<sql:update dataSource="${venki}" var="result">
	insert into vcv values(77,'zzzz','zzzz')
</sql:update>

<sql:query dataSource="${venki}" var="result">
	select * from vcv;
</sql:query>
<table border="1" width="100%">
	<tr>
		<th>id</th>
		<th>name</th>
		<th>address</th>
	</tr>

	<c:forEach var="row" items="${result.rows }">
		<tr>
			<td><center>
					<c:out value="${row.id }" />
				</center></td>
			<td><center>
					<c:out value="${row.name }" />
				</center></td>
			<td><center>
					<c:out value="${row.address }" />
				</center></td>
		</tr>
	</c:forEach>
</table>
<p>After Deletion of id : 77</p>
<sql:update dataSource="${venki}" var="result">
	delete from vcv where id=77;
</sql:update>


<sql:query dataSource="${venki}" var="result">
	select * from vcv;
</sql:query>
<table border="1" width="100%">
	<tr>
		<th>id</th>
		<th>name</th>
		<th>address</th>
	</tr>

	<c:forEach var="row" items="${result.rows }">
		<tr>
			<td><center>
					<c:out value="${row.id }" />
				</center></td>
			<td><center>
					<c:out value="${row.name }" />
				</center></td>
			<td><center>
					<c:out value="${row.address }" />
				</center></td>
		</tr>
	</c:forEach>
</table>
<p>After Updation of id : 77</p>
<sql:update dataSource="${venki}" var="result">
	update vcv set name='yyyy' where id='77'; 
</sql:update>


<sql:query dataSource="${venki}" var="result">
	select * from vcv;
</sql:query>
<table border="1" width="100%">
	<tr>
		<th>id</th>
		<th>name</th>
		<th>address</th>
	</tr>

	<c:forEach var="row" items="${result.rows }">
		<tr>
			<td><center>
					<c:out value="${row.id }" />
				</center></td>
			<td><center>
					<c:out value="${row.name }" />
				</center></td>
			<td><center>
					<c:out value="${row.address }" />
				</center></td>
		</tr>
	</c:forEach>
</table>

<body>

</body>
</html>