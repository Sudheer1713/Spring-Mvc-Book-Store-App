<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <font color ="green">${success}</font>
    <font color = "red">${failure}</font>
	<form:form action="/saveStudent" modelAttribute="book" method="POST">

		<table>
			<tr>
				<td>Name :</td>
				<td><form:input path="name" />
			</tr>
			<tr>
				<td>Price :</td>
				<td><form:input path="price" />
			</tr>
			<tr>
				<td>Author :</td>
				<td><form:input path="author" />
			</tr>

			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>

		</table>

	</form:form>
	<a href ="listOfBooks">ViewAllBooks</a>
</body>
</html>