package com.valdir.mc.domain.dto;

import java.io.Serializable;

import com.valdir.mc.domain.Cidade;

public class CidadeDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;

	public CidadeDTO() {
		super();
	}

	public CidadeDTO(Cidade obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
