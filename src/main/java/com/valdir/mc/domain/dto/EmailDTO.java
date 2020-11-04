package com.valdir.mc.domain.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

public class EmailDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "Preenchimento obrigatório!")
	@NotEmpty(message = "E-mail inválido!")
	private String email;

	public EmailDTO() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
