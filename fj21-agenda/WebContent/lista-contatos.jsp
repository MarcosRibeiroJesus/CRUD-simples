<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<c:import url="cabecalho.jsp" />
	<title>Indra 2017 - Lista de Contatos</title>
</head>

<body>
	<!-- Cria o DAO -->
	<jsp:useBean id="dao" class="br.com.caelum.agenda.dao.ContatoDao" />
	
  	
	
	<table class="table table-striped">
		<!-- percorre contatos montando as linhas da tabela -->
		<thead>
				<tr>
					<th>#</th>
					<th>Nome</th>
					<th>Telefone</th>
					<th>E-mail</th>
					<th>Profissão</th>
					<th>Data de Nascimento</th>
					<th>Editar</th>
					<th>Excluir</th>
				</tr>
			</thead>
		<c:forEach var="contato" items="${dao.lista }" varStatus="id">
			
			<tr >
				<td>${id.count}</td>
				<td>${contato.nome}</td>
				<td>${contato.telefone}</td>
				<td>
					<c:if test="${not empty contato.email}">
						<a href="mailto:${contato.email}">${contato.email}</a>
					</c:if>
				</td>
				<td>${contato.profissao}</td>
				<td><fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy" /></td>
				<!-- Editar e Excluir -->
				<td><a><i class="fa fa-pencil-square-o fa-2x" aria-hidden="false"></i></a></td>
				<td><a href="mvc?logica=RemoveContatoLogic&id=${contato.id}"><i class="fa fa-trash fa-2x" aria-hidden="false"></i></a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>