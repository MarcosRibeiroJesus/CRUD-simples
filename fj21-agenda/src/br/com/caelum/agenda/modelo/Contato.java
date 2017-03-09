package br.com.caelum.agenda.modelo;

import java.util.Calendar;

public class Contato {

		private Long id;
	  private String nome;
	  private String email;
	  private String telefone;
	  private String profissao;
	  private Calendar dataNascimento;

	  // métodos get e set para id, nome, email, endereço e dataNascimento

	  public String getNome() {
	    return this.nome;
	  }
	  public void setNome(String novo) {
	    this.nome = novo;
	  }
	  
	  public String getTelefone() {
			return telefone;
	  }
	  public void setTelefone(String telefone) {
		  this.telefone = telefone;
	  }

	  public String getEmail() {
	    return this.email;
	  }
	  public void setEmail(String novo) {
	    this.email = novo;
	  }

	  public String getProfissao() {
	    return this.profissao;
	  }
	  public void setProfissao(String novo) {
	    this.profissao = novo;
	  }

	  public Long getId() {
	    return this.id;
	  }
	  public void setId(Long novo) {
	    this.id = novo;
	  }

	  public Calendar getDataNascimento() {
	    return this.dataNascimento;
	  }
	  public void setDataNascimento(Calendar dataNascimento) {
	    this.dataNascimento = dataNascimento;
	  }
	
}
