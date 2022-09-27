<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="br.com.model.JavaBeans"%>
<%@page import="java.util.ArrayList"%>
<%
	ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>)request.getAttribute("cadastros");


%>
<!DOCTYPE html>
<html lang="PT-BR">
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet" href="Style2.css" />
<title>Insert title here</title>
</head>
<body>
	<h1>Viagens Agendadas</h1>
	<a href="CadastroDestino.html" class="btn1">Nova Viagem</a>
	<table id="tabela">
		<thead>
			<tr>
				<th>Id</th>
				<th>Classe</th>
				<th>Data de Ida</th>
				<th>Data de Volta</th>
				<th>Crianças</th>
				<th>Adultos</th>
				<th>Origem</th>
				<th>Destino</th>
				<th>Editar</th>
			</tr>
		</thead>
		<tbody>
			<%for (int i = 0; i < lista.size(); i++) { %>
				<tr>
					<td><%=lista.get(i).getIdAgenda()%></td>
					<td><%=lista.get(i).getClasse()%></td>
					<td><%=lista.get(i).getDataIda()%></td>
					<td><%=lista.get(i).getDataVolta()%></td>
					<td><%=lista.get(i).getQtdCrianca()%></td>
					<td><%=lista.get(i).getQtdAdulto()%></td>
					<td><%=lista.get(i).getOrigem()%></td>
					<td><%=lista.get(i).getDestino()%></td>
					<td><a href="selecionar?idAgenda=<%=lista.get(i).getIdAgenda()%>" class="btn1">Editar Cadastro</a></td>
				</tr>
			
			<%} %>
		</tbody>
	</table>
</body>
</html>