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
	pageContext.setAttribute("result","hello");
%>
	<%-- <%= request.getAttribute("result") %> --%>
	${result}
	${requestScope.result }
	
	---------------------------------------------------<br>
	${param.num}
	---------------------------------------------------<br>
	${param.num>=3 }
	${param.num ge 3 }
	---------------------------------------------------<br>
	${empty param.num }
	${ not empty param.num }
	---------------------------------------------------<br>
	${empty param.num ? '값이 비었다.' :param.num}
	<%-- ${names[0]}<br> --%>
	<%-- ${names [1]}<br> --%>
	<%-- ${notice.id}<br> --%>
	<%-- ${notice.title}<br> --%>
</body>
</html>