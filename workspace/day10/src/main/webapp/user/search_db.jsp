<%@ page import="com.codingbox.dao.MemberDAO" %>
<%@ page import="com.codingbox.dto.MemberDTO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String userid = request.getParameter("userid");
    MemberDAO dao = new MemberDAO();
    MemberDTO user = dao.searchById(userid);
    request.setAttribute("user", user);
    pageContext.forward("searchview.jsp");

%>
</body>
</html>