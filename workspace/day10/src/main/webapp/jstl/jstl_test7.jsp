<%@page import="java.util.HashMap"%> <%@ page
contentType="text/html;charset=UTF-8" language="java"%> <%@ taglib
uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
   <c:choose>
    <c:when test="${empty param.dan}">
      <form action="">
      단 <input type="text" name="dan" />
      <input type="submit" />
    </form>
    </c:when>
    <c:otherwise>
       <c:set var="dan" value="${param.dan}" />
        <c:choose>
          <%-- 정상적으로 입력시 --%>
          <c:when test="${dan >= 1 and dan <= 100}">
            <c:forEach var="i" begin="1" end="9" step="1">
              ${dan} * ${i} = ${dan*i} <br>
            </c:forEach>

          </c:when>
          <c:otherwise>
            <%-- 정상적으로 입력하지 않았을 시 --%>
            1이상 100이하의 숫자를 입력하세요?
          </c:otherwise>
        </c:choose>

    </c:otherwise>
   </c:choose>
    <hr />  

    <input type="button" onclick="history.go(-1)" value="홈으로 돌아가기" />

    
 
  </body>
</html>
