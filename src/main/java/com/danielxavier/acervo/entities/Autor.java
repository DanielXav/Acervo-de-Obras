package com.danielxavier.acervo.entities;

import java.util.Date;

public class Autor {

	private Long id;
	private String nome;
	private String pais;
	private Date anoNasc;
	private String cpf;
	
	public Autor() {
	}

	public Autor(Long id, String nome, String pais, Date anoNasc, String cpf) {
		this.id = id;
		this.nome = nome;
		this.pais = pais;
		this.anoNasc = anoNasc;
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Date getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(Date anoNasc) {
		this.anoNasc = anoNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
