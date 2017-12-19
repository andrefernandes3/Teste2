<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Exibindo chamados</title>
	</head>
	<body>
		<a href="index.html">Início</a><br/>
		<table>
			<thead>
				<tr>
					<th>número</th>
					<th>Descrição</th>
					<th>Abertura</th>
					<th>Fechamento</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${chamados}" var="item_chamado">
					<tr>
						<td>${item_chamado.numero}</td>
						<td>${item_chamado.descricao}</td>
						<td><fmt:parseDate  pattern="dd" value="${item_chamado.dataAbertura.time.time}"/></td>
						<td><fmt:parseDate  pattern="dd" value="${item_chamado.dataFechamento.time.time}"/></td>
						<td>${item_chamado.status}</td>
					</tr>
				</c:forEach>
			</tbody>		
		</table>
	</body>
</html>