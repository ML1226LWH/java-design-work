<%@ page pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
</head>
<body>
<%
request.setCharacterEncoding("GBK");
String key = request.getParameter("key");
System.out.println(key);
out.print(key);
%>
</body>