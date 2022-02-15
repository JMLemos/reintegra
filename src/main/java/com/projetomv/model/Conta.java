package com.projetomv.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "conta")
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idConta;
	
	@NotNull
	private long numConta;
	
	@NotNull
	@Size (min = 2 , max = 20)
	private String tipoConta;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataDeAbertura= new java.sql.Date(System.currentTimeMillis());
	
	
	private double saldoInicial;
		
	

	public Conta(long idConta,
			@NotNull long numConta,
			@NotNull @Size(min = 2, max = 20) String tipoConta,
			@NotNull Date dataDeAbertura,
			double saldoInicial, Movimentacoes movimentacoes) {
		super();
		this.idConta = idConta;
		this.numConta = numConta;
		this.tipoConta = tipoConta;
		this.dataDeAbertura = dataDeAbertura;
		this.saldoInicial = saldoInicial;
	}

	public long getIdConta() {
		return idConta;
	}

	public void setIdConta(long idConta) {
		this.idConta = idConta;
	}

	public long getNumConta() {
		return numConta;
	}

	public void setNumConta(long numConta) {
		this.numConta = numConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Date getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(Date dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
	
	
	
	

}
