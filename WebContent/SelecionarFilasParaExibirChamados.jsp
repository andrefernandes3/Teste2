<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Escolha uma fila</title>
	</head>
	<body>
			<a href="index.html">Início</a><br/>
			<form action="GerarChamadosPorFila" method="post">
				<select name="id_fila">
				<c:forEach items="${filas}" var="item_fila">
					<option value="${item_fila.id}">${item_fila.nome}</option>					
				</c:forEach>
				</select>
				<input type="submit" value="Listar Chamados"/>
			</form>
			
	</body>
</html>