package com.reintegra.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "temas")
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTema;
	
	@NotNull
	@Size(min = 2, max = 100)
	private String areas;
	
	@NotNull
	@Size(min = 2, max = 500)
	private String tipoVagas;
	
	@NotNull
	@Size(min = 2, max = 200)
	private String localizacao;
	
	@OneToMany(mappedBy = "temaRelacionado", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties({"temaRelacionado"})	
	private List<Postagem> postagens = new ArrayList<>();

	
	public List<Postagem> getMinhasPostagens() {
		return postagens;
	}
	public void setMinhasPostagens(List<Postagem> postagens) {
		this.postagens = postagens;
	}
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
