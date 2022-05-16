package com.danielxavier.acervo.entities;

import java.util.Date;
import java.util.List;

public class Obra {

	private Long id;
	private String nome;
	private String descricao;
	private Date dataPublicacao;
	private List<Autor> autores;
	
	public Obra() {
	}

	public Obra(Long id, String nome, String descricao, Date dataPublicacao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.dataPublicacao = dataPublicacao;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public List<Autor> getAutores() {
		return autores;
	}
	
}
