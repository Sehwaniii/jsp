<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib
uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <h2>JSTL TEST2(제어-조건식)</h2>
    <c:set var="num" value="100" />
    <c:if test="${num gt 50}">
      <script>
        alert("이 수는 50보다 크다");
      </script>
    </c:if>
    <c:if test="${num gt 30}">
      <script>
        alert("이 수는 50보다 크다");
      </script>
    </c:if>
  </body>
</html>
