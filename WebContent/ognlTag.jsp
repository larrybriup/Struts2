<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ognlTag</title>
</head>
<body>
	<s:if test="@java.lang.Integer@parseInt(#parameters.score)>=90">优秀</s:if>
	<s:elseif test="@java.lang.Integer@parseInt(#parameters.score)>=80">良好</s:elseif>
	<s:elseif test="@java.lang.Integer@parseInt(#parameters.score)>=60">及格</s:elseif>
	<s:else>不及格</s:else><br>
	
	<s:fielderror/>
	<s:iterator value="list">
		<s:property value="id"/>
		<s:property value="name"/>
		<s:property value="age"/><br>
	</s:iterator><hr>
	<s:iterator value="list" id="u">
		<s:property value="#u.id"/>
		<s:property value="#u.name"/>
		<s:property value="#u.age"/><br>
	</s:iterator>
	遍历map类型集合<br>
	<s:iterator value="map" id="entry">
		<s:property value="key"/>-->
		<s:property value="value.id"/>
		<s:property value="value.name"/>
		<s:property value="value.age"/><br>
	</s:iterator><br>
	<s:iterator value="map" id="entry">
		<s:property value="#entry.key"/>-->
		<s:property value="#entry.value.id"/>
		<s:property value="#entry.value.name"/>
		<s:property value="#entry.value.age"/><br>
	</s:iterator><br>
	<s:set name="myName" value="'tom'" ></s:set>
	<s:set name="myName" value="#entry.value.name" ></s:set>
	<s:set name="myName" value="'tom4'" scope="request"></s:set>
	<s:set name="my.msg" value="'hello'"></s:set>
	<s:property value="#myName"/><br>
	<s:property value="#request.myName"/><br>
	<s:property value="#attr['my.msg']"/><br>
	<hr>
	<s:set name="myList" value="{'tom1','tom2','tom3'}"></s:set>
	<s:property value="#myList[0]"/><br>
	<s:property value="#myList.size"/><br>
	<hr>
	<s:set name="myMap" value="#{'1':'tom1','2':'tom2','3':'tom3'}"></s:set>
	<s:property value="#myMap.size"/><br>
	<s:property value="#myMap.keys"/><br>
	<s:property value="#myMap.values"/><br>
	<s:property value="#myMap['1']"/><br>
	<hr>
	<s:include value="index.jsp">
		<s:param name="name" value="lisi"></s:param>
	</s:include>
	<hr>
	<s:form action="user/tagFormAction" method="post">
		<s:textfield name="username" label="用户名" ></s:textfield>
		<s:password name="password" label="密码"></s:password>
		<!-- list="{'男','女'}" 把男和女传给action -->
		<s:radio name="gender" list="#{'0':'男','1':'女'}" label="性别"></s:radio>
		<!-- struts2标签中的多选框checkbox
			fen两种:
			1,单个的checkbox
			2,一组checkbox
		 -->
		<!--  一组checkbox-->
		<s:checkboxlist list="{'足球','篮球','排球'}" name="hoppy" label="爱好" value="{'排球'}"></s:checkboxlist>
		<s:select list="{'大连','昆山','上海'}" name="city" label="城市" headerKey="-1" headerValue="城市"></s:select>
		<s:textarea name="dis" rows="5" cols="20" label="个人介绍" ></s:textarea>
		<s:checkbox name="autoLogin" fieldValue="yes" label="一周内自动登陆"></s:checkbox>
		<s:submit value="提交" method="execute"></s:submit>
		<s:submit value="注册" method="register"></s:submit>
		<s:submit type="image" src="11.gif"></s:submit>
	</s:form>
	<s:a href="index.jsp">主页1</s:a>
	<s:url value="http://www.baidu.com" var="myURL1"></s:url>
	<!-- myURL1是一个变量,在这里要用%{myURL1}来拿变量的值 -->
	<s:a href="%{myURL1}">百度</s:a>
	
	<!-- <s:url/>是会把这个变量放到AC里面,同时我们还可以从VS中拿值,类似于<s:set/>标签的效果 -->
	<s:url value="/index.jsp" var="myURL2"></s:url>
	<s:a href="%{myURL2}">百度</s:a>
	
	<s:url action="mytest" namespace="/user" var="myURL3"></s:url>
	<s:a href="%{myURL3}">test</s:a>
	
	<s:set name="myURL4" value="'http://www.baidu.com'"></s:set>
	<s:a href="%{myURL4}">百度4</s:a>
	<s:debug></s:debug>
</body>
</html>