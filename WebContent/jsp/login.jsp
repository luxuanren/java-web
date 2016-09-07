<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎登录</title>
<link rel="stylesheet" href="../style/ui.css">
<script src="../js/jquery-3.1.0.min.js"></script>
</head>
<body>
	<div id="frame">
		<label>第 <%=application.getAttribute("counts") %>次访问</label>
        <form id="registerForm" class="fontType">
                <div class="int" >
                    <label for="username" class="int">用户名：</label>
                    <input id="username" class="required" type="text" value="lxr">
                </div>
                <div class="int">
                    <label for="email" class="int">邮箱：</label>
                    <input id="email" class="required" type="email">
                </div>
                <div class="int" >
                    <label for="password" class="int">密码：</label>
                    <input id="password" class="required" type="password" value="123">
                </div>
                <div class="sub">
                    <input id="submitbtn" type="submit" value="登录" >
                </div>
        </form>
</body>
</html>