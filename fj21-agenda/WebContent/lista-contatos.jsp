<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	<meta name="viewport" content="width=device-width, initial-scale=1"/>
	<!-- Bootstrap CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css" /> 
    <!-- Google Fonts -->
    <link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css' />
    <link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css' />
	
	<title>Indra 2017 - Lista de Contatos</title>
</head>
<body>
	<!-- Cria o DAO -->
	<jsp:useBean id="dao" class="br.com.caelum.agenda.dao.ContatoDao" />
	
  	<img class="img-responsive" src="imagens/indra.png" alt="CRUD Indra"/><hr/>
	
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
				<td><i class="fa fa-pencil-square-o fa-2x" aria-hidden="false"></i></td>
				<td><i class="fa fa-trash fa-2x" aria-hidden="false"></i></td>
			</tr>
		</c:forEach>
	</table>
	
	<hr />
				<!-- Button -->
				<div class="form-group">
					<label></label>
					<a href="adiciona-contato.html" class="btn btn-primary">Novo</a>
				</div>
</body>
</html>