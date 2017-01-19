<%@page import="br.com.caelum.agenda.dao.ContatoDao"%>
<%@page import="br.com.caelum.agenda.modelo.Contato"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- comentario em JSP aqui: nossa primeira pagina --%>
	
	<%
		String mensagem = "Bem vindo ao sistema de agenda FJ21";
	%>
	
	<% out.println(mensagem); %>
	<br/>
	
	<% ContatoDao dao = new ContatoDao();
		List<Contato> lista = dao.getLista();
		
	
	%>
	<br/>

	<% System.out.println("Tudo foi executado"); 
	
	%>	
	
</body>
</html>