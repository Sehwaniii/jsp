<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>JSTL test(변수)</h2>
    <!-- 변수 선언, scope : 어느 범위까지 사용하는지, page : pageContext -->
    <!-- jstl로 변수 선언 시, setAttribute로 값을 넣기 때문에 el문으로 값을 가지고 올 수 있다. -->
    <c:set var="userid" value="apple" scope="page">
    회원아이디 <c:out value="${userid}"/> <br>
    <hr>
    <c:set var="userid" scope = "session">admin</c:set>
    <c:set var="userid" scope = "session">admin0000</c:set>
    회원 아이디 : ${userid} <br>
    회원 패스워드 : ${userid} <br>
    회원 아이디 : ${sesddionScopeuserid} <br>
    회원 패스워드 : ${userid} <br>
</body>
</html>