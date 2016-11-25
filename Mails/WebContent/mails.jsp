<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mail Login Page</title>
</head>
<!-- 
<script src="D:\MY Training Period Eclipse WorkSpace\testTextarea&writeToXML_stax\jquery-1.11.1.js"></script>

 -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="F:\EclipseNeonWorkspace\jars\jquery.validate.min.js"></script>
<script>
	$(document).ready(function(){
		
		$("#myform").validate({
			rules:
			{
				username:
					{
						required:true,
					},
				password:
					{
						required:true,
					},
			},
			messages: 
				{
					username : " Please enter username",
					password : " Please enter password"
				},
		});
		$("#username1").focusout(function(){
			var name=$("#username1").val();
			
			if(name == "")
				{
				//$("#username1").after(" Enter Username.");
				//alert("hi");
				
				}
		});
		
	
		
	});
</script>
<body>
<form method ="post" action="LoginValidation" id="myform" >
	</br>
	User name :<input type="text" id="username1" name="username"/>
	</br></br>
	Password  :<input type="password" id="pass" name="password"></br>
     <pre>    		<input type="submit" value="Login">   </pre>          	
</form>	
</body>
</html>