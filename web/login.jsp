<%--
  Created by IntelliJ IDEA.
  User: waitting
  Date: 2021/5/28
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<form action="${pageContext.request.contextPath}/LoginServlet" method="post">--%>
<%--    ${msg}<br>--%>
<%--    <input type="text" name="name" placeholder="用户名"><br>--%>
<%--    <input type="password" name="pwd" placeholder="密码"><br>--%>
<%--    <button type="submit">登录</button>--%>
<%--    <input type="button">--%>
<%--</form>--%>
<h2 align="center"><font color=red>用户登录页面</font></h2>
<h3 align="center" color="red">${msg}</h3>
<form action="${pageContext.request.contextPath}/LoginServlet" method="post">
    <table align="center" border="1">

        <tr>
            <td>用户名:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>密&nbsp;&nbsp;码:</td>
            <td><input type="password" name="pwd"></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录" name="login"></td>
            <td><input type="reset" value="重置" name="reset"></td>
        </tr>
    </table>
    <p align="center"><a href="Register.jsp" color=blue>注册用户</a></p>
</form>


</body>
</html>
