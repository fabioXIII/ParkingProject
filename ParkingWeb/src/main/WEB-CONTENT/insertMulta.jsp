<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multa</title>
</head>
<body>

    <h1>Multa Form</h1>
    
    <form action="${pageContext.request.contextPath}/multa/insertMulta" method="post">
        <label for="targa">Targa Auto:</label>
        <input type="text" id="targa" name="targa" /><br>
        
        <label for="importo">Importo:</label>
        <input type="number" id="importo" name="importo" /><br>
        
         <label for="idVigile">Id Vigile:</label>
        <input type="number" id="idVigile" name="idVigile" /><br>
        
        
        <input type="submit" value="Submit" />
    </form>


</body>
</html>