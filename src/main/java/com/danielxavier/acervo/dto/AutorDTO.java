package com.danielxavier.acervo.dto;

import com.danielxavier.acervo.entities.Autor;

public class AutorDTO {
	
	private Long id;
	private String nome;
	private String pais;
	private Integer anoNasc;
	private String cpf;
	
	public AutorDTO() {
	}

	public AutorDTO(Long id, String nome, String pais, Integer anoNasc, String cpf) {
		this.id = id;
		this.nome = nome;
		this.pais = pais;
		this.anoNasc = anoNasc;
		this.cpf = cpf;
	}
	
	public AutorDTO(Autor entity) {
		id = entity.getId();
		nome = entity.getNome();
		pais = entity.getPais();
		anoNasc = entity.getAnoNasc();
		cpf = entity.getCpf();
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

	public Integer getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(Integer anoNasc) {
		this.anoNasc = anoNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
