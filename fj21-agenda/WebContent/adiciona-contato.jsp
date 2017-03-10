<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<c:import url="cabecalho.jsp" />
	<title>Indra 2017 - Adicionar Contato</title>
</head>

<body>
	<div class="container">
		
			<form class="form-group" action="adicionaContato">
			
				<div class="col-md-6">

				<div class="form-group">
					<label for="nome">Nome</label>
					<div class="input-group"> 
						<span class="input-group-addon"><i class="fa fa-user" aria-hidden="true"></i></span>
						<input id="nome" name="nome"	type="text" placeholder="Nome completo"
							class="form-control input-md" required>
					</div>
				</div>
				
				<div class="form-group">
					<label for="telefone">Telefone</label>
					<div class="input-group">
						<span class="input-group-addon"><i class="fa fa-phone" aria-hidden="true"></i></span> 
						<input id="telefone" name="telefone"	type="text" placeholder="61993203363"
							class="form-control input-md" required>
					</div>
				</div>

				<div class="form-group">
				
					<label for="email">Email</label>
					<div class="input-group">
                    	<span class="input-group-addon"><i class="fa fa-envelope" aria-hidden="true"></i></span> 
						<input id="email" name="email" type="text" placeholder="Endereço de e-mail"
							class="form-control input-md" required>
					</div>
				</div>

				<div class="form-group">
					<label for="profissao">Profissão</label>
					<div class="input-group">
                    	<span class="input-group-addon"><i class="fa fa-users" aria-hidden="true"></i></span> 
						<input id="profissao" name="profissao" type="text" placeholder="Profissão"
							class="form-control input-md">
					</div>
				</div>

				<div class="form-group">
					<label for="dataNascimento">Data de Nascimento</label>
					<div class="input-group">
                    	<span class="input-group-addon"><i class="fa fa-calendar" aria-hidden="true"></i></span>
						<input id="dataNascimento" name="dataNascimento" type="text" placeholder="08/03/2017" 
							class="form-control input-md" required>
					</div>
				</div>
				
				<hr />
				<!-- Button -->
				<div class="form-group">
					<label for="submit"></label>
					<button id="submit" name="submit" class="btn btn-primary">Gravar</button>
					<a href="lista-contatos.jsp" class="btn btn-default">Listar Contatos</a>
				</div>
				
			

			</div>
		</form>
	</div>

	<!-- Bootstrap JS -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>

</html>