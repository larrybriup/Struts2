<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>convertor.jsp</title>
</head>
<body>
 	<form action="user/convertor-action" method="post">
 		用户:<input type="text" name="user" /><span>格式1:tom:20</span>
 		<input type="submit" value="提交" />
 	</form>
 	
 	<hr>
 	<s:debug></s:debug><br>
</body>
</html>