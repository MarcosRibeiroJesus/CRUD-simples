<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,
    	java.text.SimpleDateFormat,
		br.com.caelum.agenda.dao.*,
		br.com.caelum.agenda.modelo.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Contato</title>
</head>
<body>

<table>
      <%
      ContatoDao dao = new ContatoDao();
      List<Contato> contatos = dao.getLista();
      
      for (Contato contato : contatos ) {
      %>
      <%
      	String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(contato.getDataNascimento().getTime());
      
      %>
      
        <tr>
          <td><%=contato.getNome() %></td>
          <td><%=contato.getTelefone() %></td> 
          <td><%=contato.getEmail() %></td>
          <td><%=contato.getProfissao() %></td>
          <td><%=contato.getDataNascimento().getTime() %></td>
          <td><%=dataFormatada %></td>
        </tr>
      <%
      }
      %>
    </table>

</body>
</html>