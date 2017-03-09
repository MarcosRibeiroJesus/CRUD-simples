package br.com.caelum.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.agenda.jdbc.ConnectionFactory;
import br.com.caelum.agenda.modelo.Contato;

public class ContatoDao {
	 

	private Connection connection;

	public ContatoDao() {
		this.connection = new ConnectionFactory().getConnection();

	}

	public void adiciona(Contato contato) {
		String sql = "insert into contatos " + "(nome,telefone,email,profissao,dataNascimento)" + " values (?,?,?,?,?)";
		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);

			// seta os valores
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getTelefone());
			stmt.setString(3, contato.getEmail());
			stmt.setString(4, contato.getProfissao());
			stmt.setDate(5, new Date(contato.getDataNascimento().getTimeInMillis()));

			// executa
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}

	public void altera(Contato contato) {

		String sql = "update contatos set nome=?, telefone=?, email=?," +

		"profissao=?, dataNascimento=? where id=?";

		try {

			PreparedStatement stmt = connection

					.prepareStatement(sql);

			stmt.setString(1, contato.getNome());
			
			stmt.setString(2, contato.getTelefone());

			stmt.setString(3, contato.getEmail());

			stmt.setString(4, contato.getProfissao());

			stmt.setDate(5, new Date(contato.getDataNascimento()

					.getTimeInMillis()));

			stmt.setLong(6, contato.getId());

			stmt.execute();

			stmt.close();

		} catch (SQLException e) {

			throw new DAOException(e);

		}

	}

	public void remove(Contato contato) {

		try {

			PreparedStatement stmt = connection

					.prepareStatement("delete from contatos where id=?");

			stmt.setLong(1, contato.getId());

			stmt.execute();

			stmt.close();

		} catch (SQLException e) {

			throw new DAOException(e);

		}

	}

	// Exercício 2.13.1
	public List<Contato> getLista() {
		try {
			List<Contato> contatos = new ArrayList<>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from contatos");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				// criando o objeto Contato
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setTelefone(rs.getString("telefone"));
				contato.setEmail(rs.getString("email"));
				contato.setProfissao(rs.getString("profissao"));

				// montando a data através do Calendar
				Calendar data = Calendar.getInstance();

				data.setTime(rs.getDate("dataNascimento"));

				contato.setDataNascimento(data);

				// adicionando o objeto à lista
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			return contatos;
		} catch (SQLException e) {

			throw new DAOException(e);
		}
	}

	// Busca por id
	public List<Contato> getListaId(int id) {
		try {
			List<Contato> contatos = new ArrayList<>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from contatos where id =" + id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				// criando o objeto Contato
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setTelefone(rs.getString("telefone"));
				contato.setEmail(rs.getString("email"));
				contato.setProfissao(rs.getString("profissao"));

				// montando a data através do Calendar
				Calendar data = Calendar.getInstance();

				data.setTime(rs.getDate("dataNascimento"));

				contato.setDataNascimento(data);

				// adicionando o objeto à lista
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			return contatos;
		} catch (SQLException e) {

			throw new DAOException(e);
		}
	}

	public List<Contato> getListaNome(String busca) {// Não funciona
		try {
			List<Contato> contatos = new ArrayList<>();
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from contatos WHERE nome ='" + busca + "%'");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				// criando o objeto Contato
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setTelefone(rs.getString("telefone"));
				contato.setEmail(rs.getString("email"));
				contato.setProfissao(rs.getString("profissao"));

				// montando a data através do Calendar
				Calendar data = Calendar.getInstance();

				data.setTime(rs.getDate("dataNascimento"));

				contato.setDataNascimento(data);

				// adicionando o objeto à lista
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			return contatos;
		} catch (SQLException e) {

			throw new DAOException(e);
		}
	}
	 
	 }