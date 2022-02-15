package com.projetomv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;

	@NotNull
	@Size(min = 2, max = 100)
	private String nome;

	@NotNull
	@Size(min = 2, max = 100)
	private String telefone;

	@NotNull
	private Long numDocumento;
	
	@ManyToOne
	private Conta conta;
	
	@OneToOne
	private Endereco endereco;
	
	
	public Cliente(Long idCliente,
			@NotNull @Size(min = 2, max = 100) String nome,
			@NotNull @Size(min = 2, max = 100) String telefone,
			@NotNull Long numDocumento, 
			Conta conta,
			Endereco endereco) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.telefone = telefone;
		this.numDocumento = numDocumento;
		this.conta = conta;
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Long getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(Long numDocumento) {
		this.numDocumento = numDocumento;
	}

}
