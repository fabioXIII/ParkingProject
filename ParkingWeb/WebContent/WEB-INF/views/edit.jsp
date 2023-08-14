<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<label>Nome della persona</label><br/>
<input type="text" name="nome" value="${model.nome}" class="form-control" /><br/>


<input type="submit" value="Salva" class="btn"/>

</form>
<a href="${pageContext.request.contextPath}/persona/index">Elenco</a>
</body>
</html>