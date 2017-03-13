<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
	<!-- <form action="Register" method="post">
		Name - <input type="text" name="username"><br /> <br />
		Password - <input type="password" name="userpassword"><br />
		<br /> Email Id. - <input type="text" name="useremail"><br />
		<br /> Country - <input type="text" name="usercountry"><br />
		<br /> <br /> <br /> <input type="submit" name="register">
	</form> -->

	<h2>Student Information</h2>
	<form:form method="POST" action="Register" command="command1" >
		<table>
			<tr>
				<td colspan="2" align="center"><h2>Spring MVC Form Demo -
						Registration</h2></td>
			</tr>
			<tr>
				<td><form:label path="userName">Name - </form:label></td>
				<td><form:input path="userName" /></td>
			</tr>
			<tr>
				<td><form:label path="userPassword">Password - </form:label></td>
				<td><form:password path="userPassword" /></td>
			</tr>
			<tr>
				<td><form:label path="userEmail" type="">Email Id. - </form:label></td>
				<td><form:input  path="userEmail" /></td>
			</tr>
			<tr>
				<td><form:label path="userCountry">Country - </form:label></td>
				<td><form:input path="userCountry" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>