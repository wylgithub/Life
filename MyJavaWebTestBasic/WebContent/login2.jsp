<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String userName = (String)session.getAttribute("name");
	if(userName == null){
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
%>
<h3>欢迎登录！</h3>
</body>
</html>