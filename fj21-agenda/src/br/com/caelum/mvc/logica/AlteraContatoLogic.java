package br.com.caelum.mvc.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class AlteraContatoLogic implements Logica {
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		Contato contato = new Contato();

		String id = req.getParameter("id");
		contato.setId(Long.parseLong(id));

		contato.setNome(req.getParameter("nome"));
		contato.setTelefone(req.getParameter("telefone"));
		contato.setEmail(req.getParameter("email"));
		contato.setProfissao(req.getParameter("profissao"));
		
		// Converte a data de string para calendar		String dataEmTexto = req.getParameter("dataNascimento");		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);		Calendar dataNascimento = Calendar.getInstance();
		String dataEmTexto = "10/10/2011";
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(date);
		
		contato.setDataNascimento(dataNascimento);

		ContatoDao dao = new ContatoDao();
		dao.altera(contato);

		RequestDispatcher rd = req
				.getRequestDispatcher("/lista-contatos.jsp");
		rd.forward(req, res);
		return "";

	}
}