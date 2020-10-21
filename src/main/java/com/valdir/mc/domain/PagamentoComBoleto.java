package com.valdir.mc.domain;

import java.util.Date;

public class PagamentoComBoleto extends Pagamento {

	private Date dataVencimento;
	private Date dataPagamento;

	public PagamentoComBoleto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PagamentoComBoleto(Integer id, Integer estado) {
		super(id, estado);
		// TODO Auto-generated constructor stub
	}

	public PagamentoComBoleto(Date dataVencimento, Date dataPagamento) {
		super();
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

}
