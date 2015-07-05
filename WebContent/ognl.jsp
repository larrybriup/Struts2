<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ognl表达式</title>
</head>
<body>
 	<h3>输出文本字符串</h3>
	 	<s:property value="'hello'"/><br>
	 	<s:property value="'1+9'"/><br>
 	
 	<h3>输出运算式</h3>
 		<s:property value="1+9"/><br>
 	
 	<h3>输出布尔表达式结果</h3>
	 	<s:property value="1<9"/><br>
	 	<s:property value="1>9"/><br>
	 	<s:property value="1>9||1>-1"/><br>
	 	<s:property value="1>9&&1<-1"/><br>
	 	<s:property value="1>9?'三炮':'四炮'"/><br>
 	
 	<h3>从ValueStack中取值</h3>
	 	name=<s:property value="name"/><br>
	 	locale=<s:property value="locale"/><br>
	 	user=<s:property value="user"/><br>
	 	user.id=<s:property value="user.id"/><br>
	 	user.name=<s:property value="user.name"/><br>
	 	user.age=<s:property value="user.age"/><br>
 	
 	<h3>从ValueStack中取值的时候,有两个名字相同的值,做特殊处理,就可以取到</h3>
	 	<!-- [1]表示去拿到ValueStack中第二个对象的name属性值,vs中对象从上到下0,1,2... -->
	 	name=<s:property value="[1].name"/><br>
 	
 	<h3>取到ValueStack中的属性值,如果属性值是一个对象,就可以调用对象的方法</h3>
	 	<!-- 只要可以拿到对象就可以调用方法,不管是怎么拿到的 -->
	 	name=<s:property value="user.getName()"/><br>
	 	name=<s:property value="user.say()"/><br>
	 	<h4>调用类中的构造器对象,并且调用对象的方法</h4>
	 	<s:property value="new com.eagle.bean.User().getId()"/><br>
	 	
 	<h3>取到ActionContex中的属性值,如果属性值是一个对象,就可以调用对象的方法</h3>
 		<s:property value="#user.say()"/><br>
 	
 	<h3>直接调用字符串对象的方法</h3>
	 	<s:property value="'abc'.equals('bcd')"/><br>
	 	<s:property value="'三炮'.equals('三炮')"/><br>
 	
 	<h3>调用ValueStack中action/其他对象的静态方法</h3>
 	<!-- 格式@vs1@静态方法的名字,vs1中1代表ValueStack中的第一个对象 -->
 		<s:property value="@vs2@myStatic()"/><br>
 	
 	<h3>调用JDK中类或者自定义类中的方法</h3>
	 	<!-- 第一个@后加类的全名,可以不写,建议写(规范)
	 		 第二个@后面加上静态属性/静态方法
	 		 -->
 		<s:property value="@@PI"/><br>
 		<s:property value="@java.lang.Math@random()"/><br>
 		<s:property value="@com.eagle.bean.User@myStatic()"/><br>
 	
 	
 	<s:debug></s:debug><br>
</body>
</html>