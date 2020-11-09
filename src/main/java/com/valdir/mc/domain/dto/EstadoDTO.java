package com.valdir.mc.domain.dto;

import java.io.Serializable;

import com.valdir.mc.domain.Estado;

public class EstadoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;

	public EstadoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EstadoDTO(Estado obj) {
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
