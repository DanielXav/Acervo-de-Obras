package com.danielxavier.acervo.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.danielxavier.acervo.entities.Autor;
import com.danielxavier.acervo.entities.Obra;

public class ObraDTO {

	private Long id;
	private String nome;
	private String descricao;
	private Date dataPublicacao;
	
	private List<AutorDTO> autores = new ArrayList<>();
	
	public ObraDTO() {
	}

	public ObraDTO(Long id, String nome, String descricao, Date dataPublicacao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.dataPublicacao = dataPublicacao;
	}
	
	public ObraDTO(Obra entity) {
		id = entity.getId();
		nome = entity.getNome();
		descricao = entity.getDescricao();
		dataPublicacao = entity.getDataPublicacao();
	}
	
	public ObraDTO(Obra entity, Set<Autor> autores) {
		id = entity.getId();
		nome = entity.getNome();
		descricao = entity.getDescricao();
		dataPublicacao = entity.getDataPublicacao();
		autores.forEach(x -> this.autores.add(new AutorDTO(x)));
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

	public List<AutorDTO> getAutores() {
		return autores;
	}
	
}
