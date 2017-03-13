<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>userName</th>
			<th>userPassword</th>
			<th>userEmail</th>
			<th>userCountry</th>
		</tr>
		<c:forEach items="${list}" var="list">
			<tr>
				<th>${list.userName}</th>
				<th>${list.userPassword}</th>
				<th>${list.userEmail}</th>
				<th>${list.userCountry}</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>