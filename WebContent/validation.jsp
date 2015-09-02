<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>validation.jsp</title>
</head>
<body>
	<h3><s:fielderror></s:fielderror></h3>
 	<form action="user/validation-action" method="post">
 		用户名:<input type="text" name="username" value="${username}"/>
 		密码:<input type="text" name="password" />
 		<input type="submit" value="提交" />
 	</form>
 	<hr>
 	<s:debug></s:debug><br>
</body>
</html>