package com.valdir.mc.domain.enums;

public enum EstadoPagamento {

	PENDENTE(1, "Pendente"), QUITADO(2, "Quitado"), CANCELADO(3, "Cancelado");

	private Integer cod;
	private String descricao;

	private EstadoPagamento(Integer cod, String descrica) {
		this.cod = cod;
		this.descricao = descrica;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescrica() {
		return descricao;
	};

	public static EstadoPagamento toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}

		for (EstadoPagamento x : EstadoPagamento.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id " + cod + " inválido!");
	}

}
