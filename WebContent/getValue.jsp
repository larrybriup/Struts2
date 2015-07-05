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
 	<h3>从ActionContext中取值</h3>
 	<!-- 
 	
 	 -->
 	<s:property value="#request"/><br>
 	<s:property value="#action"/><br>
 	<s:property value="#action.name"/><br>
 	<s:property value="#msg"/><br>
 	<s:property value="#user"/><br>
 	
 	<s:property value="#parameters.name"/><br>
 	<s:property value="#request.myName"/><br>
 	<s:property value="#session.myName"/><br>
 	<s:property value="#application.myName"/><br>
 	
 	<s:property value="#attr.myName"/><br>
 	<h3>使用JSP脚本取值</h3>
 	<%=request.getAttribute("myName") %><br>
 	<%=request.getAttribute("name") %><br>
 	<%=session.getAttribute("myName") %><br>
 	<%=application.getAttribute("myName") %><br>
 	<h3>使用EL表达式</h3>
 	${requestScope.myName }<br>
 	${requestScope.name }<br>
 	${sessionScope.myName }<br>
 	${applicationScope.myName }<br>
 	${myName }<br>
 	<s:debug></s:debug><br>
 	
</body>
</html>