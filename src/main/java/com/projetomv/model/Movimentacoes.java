package com.projetomv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "movimentacoes")
public class Movimentacoes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMovimentacoes;
	
	@OneToOne
	private Conta conta;

	private double movCredito;
	
	private double movDebito;
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	
	public long getIdMovimentacoes() {
		return idMovimentacoes;
	}

	public void setIdMovimentacoes(long idMovimentacoes) {
		this.idMovimentacoes = idMovimentacoes;
	}

	public double getMovCredito() {
		return movCredito;
	}

	public void setMovCredito(double movCredito) {
		this.movCredito = movCredito;
	}

	public double getMovDebito() {
		return movDebito;
	}

	public void setMovDebito(double movDebito) {
		this.movDebito = movDebito;
	}
	
	
	
	
	
	

}
