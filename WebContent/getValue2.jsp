<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>getValue</title>
</head>
<body>
 	<h1>this is getValue.jsp</h1><hr>
 	<h3>从ValueStack中取值</h3>
 	name=<s:property value="name"/><br>
 	locale=<s:property value="locale"/><br>
 	user=<s:property value="user"/><br>
 	user.id=<s:property value="user.id"/><br>
 	user.name=<s:property value="user.name"/><br>
 	user.age=<s:property value="user.age"/><br>
 	
 	<s:property value="#request"/>
 	<s:debug></s:debug><br>
 	
</body>
</html>