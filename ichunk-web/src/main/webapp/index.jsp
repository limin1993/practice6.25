<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix='s' uri="/struts-tags"%>
<html>
<head>
	<title>test</title>
</head>
<body>
<h2>login</h2>
	<s:form name="login" action="login.action" method="post" namespace="/user">
		用户名：<input type="text" name="username">
		密    码：<input type="password" name="password">
		<input type="submit" value="login">
	</s:form>
</body>
</html>
