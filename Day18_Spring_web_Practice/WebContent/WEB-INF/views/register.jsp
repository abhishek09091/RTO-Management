<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  
<h3 align="center">Customer on login page is${requestScope.cust}</h3>-->
	<h3 align="center">${requestScope.msg}</h3>
	<table style="margin: auto">
		<spring:form modelAttribute="customer" method="post">
			<tr>
				<td>Enter Email</td>
				<td><spring:input path="email" /></td>
				<td><spring:errors path="email" /></td>
			</tr>
			<tr>
				<td>Enter password</td>
				<td><spring:password path="pass" /></td>
				<td><spring:errors path="pass" /></td>
			</tr>
			<tr>
				<tr>
				<td>Enter address</td>
				<td><spring:password path="address" /></td>
				<td><spring:errors path="address" /></td>
			</tr>
			<tr>
			
			
			
				<td><input type="submit" value="submit" /></td>
			</tr>
		</spring:form>
	</table>
</body>
</html>