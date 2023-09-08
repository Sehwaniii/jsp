<%@page import="java.util.HashMap"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%> <%@ taglib
uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <%-- for(int i= 0;i<=10;i++)--%>
    <c:forEach var="i" begin="1" end="9" step="1"> 
    5 * ${i } = ${5*i }<br> </c:forEach>
    <hr />
    
  </body>
</html>
