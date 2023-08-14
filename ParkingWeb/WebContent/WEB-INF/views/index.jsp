<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/style.css" var="styleCSS" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${styleCSS}"/>
</head>
<body>
<form method="post">

<label>Cerca per nome</label>
<input class="form-control" type="text" name="nome"/><input type="submit" value="Cerca"/>

</form>

<table>
<thead>
	<th>Nome</th>
	<th></th>
</thead>
<tbody>
	<c:forEach items="${model}" var="item">
	<tr>
		<td>${item.nome}</td>
		<td><a href="${pageContext.request.contextPath}/persona/delete/${item.id}">Cancella</a>
		<a href="${pageContext.request.contextPath}/persona/edit/${item.id}">Modifica</a>
		</td>
	</tr>
	</c:forEach>
</tbody>
</table>
<a href="${pageContext.request.contextPath}/persona/add">Aggiungi</a>
</body>
</html>