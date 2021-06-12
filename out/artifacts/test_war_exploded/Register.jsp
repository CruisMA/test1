<%--
  Created by IntelliJ IDEA.
  User: waitting
  Date: 2021/5/30
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 align="center"><font color=red>用户注册页面</font></h2>
<h3 align="center" color="red">${msg}</h3>
<form action="${pageContext.request.contextPath}/RegisterServlet" method="post">
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
            <td><input type="submit" value="注册" name="login"></td>
            <td><input type="reset" value="重置" name="reset"></td>
        </tr>
    </table>
</form>

</body>
</html>
