<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
<!DOCTYPE html>
<html>
<head>

<link href="css/jquery.css" rel="stylesheet">
<script src="js/jquery.js"></script>
<script src="js/jquery-ui.js"></script>

<meta charset="UTF-8">
<title>Adiciona contato</title>
</head>
<body>
<c:import url="cabecalho.jsp"/>
<h1>Adiciona Contato</h1>

<form action="adicionaContato">
	Nome: <input type="text" name="nome">
	<input type="submit" value="Gravar" /> <br />
	Data Nascimento: 
	<caelum:campoData id="dataNascimento" /> <br />
</form>
<c:import url="rodape.jsp"/>
</body>
</html>