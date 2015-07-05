<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
</head>
<body>
	<form action="user/paramAction" method="post">
		id:<input type="text" name="user.id"/><br>
		name:<input type="text" name="user.name"/><br>
		age:<input type="text" name="user.age"/><br>
		<input type="submit" value="注册"/>
	</form>
</body>
</html>