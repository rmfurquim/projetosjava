<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TAGS LIBS-----------------</title>
</head>
<body>
<jsp:useBean id="dao" class="br.com.caelum.agenda.dao.ContatoDao" />
<table>
	<c:forEach var="contato" items="${dao.lista}">
	<tr>
		<td>${contato.nome}</td>
		<td>${contato.email}</td>
		<td>${contato.endereco}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>