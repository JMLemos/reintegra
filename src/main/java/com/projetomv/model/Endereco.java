package com.projetomv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name= "endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEndereco;
	
	@NotNull
	@Size (min = 2, max = 300)
	private String logradouro;
	
	@NotNull
	@Size (min = 2, max = 100)
	private String cep;
	
	@NotNull
	private Integer numero;
	
	@NotNull
	@Size (min = 2, max = 100)
	private String complemento;
	
	@NotNull
	@Size (min = 2, max = 100)
	private String bairro;
	
	@NotNull
	@Size (min = 2, max = 100)
	private String cidade;
	
	@NotNull
	@Size (min = 2, max = 2)
	private String uf;
	
	

	public Endereco(long idEndereco,
			@NotNull @Size(min = 2, max = 300) String logradouro,
			@NotNull @Size(min = 2, max = 100) String cep, 
			@NotNull Integer numero,
			@NotNull @Size(min = 2, max = 100) String complemento,
			@NotNull @Size(min = 2, max = 100) String bairro,
			@NotNull @Size(min = 2, max = 100) String cidade, 
			@NotNull @Size(min = 2, max = 2) String uf) {
		super();
		this.idEndereco = idEndereco;
		this.logradouro = logradouro;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}

	public long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(long idEndereco) {
		this.idEndereco = idEndereco;
	}
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


}
