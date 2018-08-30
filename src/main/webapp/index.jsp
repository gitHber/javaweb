<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    <meta charset="utf-8">
    <title>登录</title>
</head>
<body>
<div style="text-align: center;display: flex;justify-content: center;align-items: center;height: 80%;">
    <div>
        <h1>登录页面</h1>
        <form action="/login">
            用户名：<input type="text" name="name"><br>
            密　码：<input type="password" name="pwd"><br>
            <input type="submit" value="登录">
            <input type="reset" value="重置">
        </form>
    </div>
</div>

</body>
</html>
