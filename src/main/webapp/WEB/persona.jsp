<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${titulo}</title>
</head>
<body>

	<form method="POST" action="/personas" >
		<table>
			<tr>
				<td><label path="dni">DNI<label></td>
				<td><Input path="dni" /></td>
			</tr>
			<tr>
				<td><label path="nombres">Nombres<label></td>
				<td><input path="nombres" /></td>
			</tr>
			<tr>
				<td><label path="edad">
                      Edad<label></td>
				<td><input path="edad" /></td>
			</tr>
			<tr>
				<td><label path="direccion">
                      Direccion</label></td>
				<td><input type="text" path="direccion" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
	<table style="border: 1px solid;">
		<thead>
			<tr>
				<th>DNI</th>
				<th>NOMBRES</th>
				<th>DIRECCION</th>
				<th>EDAD</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="persona" items="${personas}">
				<tr>
					<td style="border: 1px solid;">${persona.dni}</td>
					<td style="border: 1px solid;">${persona.nombres}</td>
					<td style="border: 1px solid;">${persona.direccion}</td>
					<td style="border: 1px solid;">${persona.edad}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>