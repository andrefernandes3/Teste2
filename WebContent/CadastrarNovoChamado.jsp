<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="model.Fila" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Cadastrar novo chamado</title>
	</head>
	<body>
	
			<h2> Com Scriplet </h2>	
	
			<% List <Fila> filas = (List <Fila>) request.getAttribute("filas"); %>
			<h2>Cadastrar novo chamado</h2>
			<label for="descricao_id">Descrição:</label>
			<input id="descricao_id" type="text" placeholder="Digite a descrição do chamado" name="descricao"/><br/>
			<label for="filas_id">Filas:</label>
			<select name="fila_selecionada">
				<% for (int i = 0; i < filas.size(); i++){ %>
					<option value="<%= filas.get(i).getId() %>"><%out.println(filas.get(i).getNome()); %></option>
				<%} %>
			</select>
			<br/>
			<h2> Com JSTL e EL </h2>	
			<label for="descricao_id">Descrição:</label>
			<input id="descricao_id" type="text" placeholder="Digite a descrição do chamado" name="descricao"/><br/>
			<label for="filas_id">Filas:</label>
			<label for="filas_id">Filas:</label>
			<select name="fila_selecionada">
				<c:forEach items="${filas}" var="fila">
					<option value=${fila.id }>${fila.nome}</option>
				</c:forEach>
			</select>			
	</body>
</html>