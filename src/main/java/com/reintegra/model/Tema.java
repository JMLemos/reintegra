package com.reintegra.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "temas")
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTema;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String areas;
	
	@NotNull
	@Size(min = 10, max = 500)
	private String tipoVagas;
	
	@NotNull
	@Size(min = 10, max = 200)
	private String localizacao;
	

	
	public long getIdTema() {
		return idTema;
	}
	public void setIdTema(long idTema) {
		this.idTema = idTema;
	}
	public String getAreas() {
		return areas;
	}
	public void setAreas(String areas) {
		this.areas = areas;
	}
	public String getTipoVagas() {
		return tipoVagas;
	}
	public void setTipoVagas(String tipoVagas) {
		this.tipoVagas = tipoVagas;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	

}
