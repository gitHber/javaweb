<%--
  Created by IntelliJ IDEA.
  User: likun
  Date: 2018/8/30
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
    <div style="text-align: center;display: flex;justify-content: center;align-items: center;height: 80%;">
        <div>
            <h1>登陆成功！</h1>
            <p><%=request.getAttribute("message") %></p>
        </div>
    </div>
</body>
</html>
