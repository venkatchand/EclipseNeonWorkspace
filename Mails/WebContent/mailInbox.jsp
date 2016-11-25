<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>inbox</title>
<!-- 
	//src="D:\MY Training Period Eclipse WorkSpace\testTextarea&amp;writeToXML_stax\jquery-1.11.1.js"

 -->
</head>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"
	type="text/javascript"></script>
<script type="text/javascript">
var path = '<%=request.getContextPath()%>';
	$(document).ready(function() {
		$('#inbox').click(function() {
			//alert("hi");
			var user;
			$.post(path + '/WelcomeMail', {
				mailcode : '1'
			}, function(responsetext) {
				//document.getElementById("in").innerHTML=responsetext;
				$('#in').html(responsetext);

			});

		});
		
		$('#inbox').hover(
				function() {
				//alert("hi");
				$(this).css({"background-color":"white"});											

				},
				function(){
					$(this).css({"background-color":"transparent"});
				}
		
		);

		$('#draft').click(function() {
			//alert("hi");
			$.post(path + '/WelcomeMail', {
				mailcode : '2'
			}, function(responsetext) {
				//document.getElementById("in").innerHTML=responsetext;
				$('#in').html(responsetext);
			});
		});
		
		

		$('#draft').hover(
				function() {
				//alert("hi");
				$(this).css({"background-color":"white"});											

				},
				function(){
					$(this).css({"background-color":"transparent"});
				}
		
		);

		$('#sent').click(function() {
			//alert("hi");
			$.post(path + '/WelcomeMail', {
				mailcode : '3'
			}, function(responsetext) {
				//document.getElementById("in").innerHTML=responsetext;
				$('#in').html(responsetext);
			});
		});
		
		$('#sent').hover(
				function() {
				//alert("hi");
				$(this).css({"background-color":"white"});											

				},
				function(){
					$(this).css({"background-color":"transparent"});
				}
		
		);
	});
</script>

<body background="hi.jpg">

	<div style="width: 100%;height: 50px;border:thin;border-color: red;">
		<b ><font color="white" size="6">Mail</font></b><div style='float: right;'>
			<a href='mails.jsp'>Log out</a>
		</div></div>
	<div
		style="float: left; margin-left: 50px; width: 40px; height: 40px:float:left; background-color:">
		
		<label id="inbox" >Input</label> <br></br> 
		<label id="draft" >Draft</label> <br></br>
		<label id="sent" >Sent</label>
	</div>
	<div id="in"
		style="float: right; margin-right: 150px; background-color:white; width: 70%; height: 70%;"><br>
		<center>Your messages will be shown here...</center>
		<br>
		<br>
		<br>
		
	</div>

</body>
</html>