<%--
  Created by IntelliJ IDEA.
  User: kitcoop
  Date: 2023-08-30
  Time: 오전 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/UserJoin.us" method="post">
    <p>
        아이디 <input type="text" name="userid">
    </p>
    <p>
        비밀번호 <input type="password" name="userpw">
    </p>
    <p>
        이름 <input type="text" name="username">
    </p>
    <p>
        전화번호 <input type="text" name="userphone">
    </p>
    <p>
        주소 <input type="text" name="useraddr">
    </p>
    <p>
        <input type="submit" value="회원가입">
    </p>
    </form>
</body>
</html>
