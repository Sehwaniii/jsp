<%@page import="com.codingbox.vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		User[] arUser = (User[])request.getAttribute("users");
		
		for( int i = 0 ; i<arUser.length;i++){
			out.println(arUser[i].userid);
			out.println(arUser[i].username);
			out.println(arUser[i].age+"<br>");
		}
	
	
	
	%>
</body>
</html>