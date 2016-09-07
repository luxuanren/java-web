<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String username = request.getParameter("username");
	String email = request.getParameter("email");

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册成功</title>
 	<script src="../js/jquery-3.1.0.min.js"></script>
    <script>
    setTimeout(function () {
        $('#show').trigger('submit');
    },3000);
    </script>
</head>
<body>
	<form id="show" action="login.jsp">
        <label>用户 : <%=username%> 注册成功</label>
       
    </form>
	
	
</body>
</html>