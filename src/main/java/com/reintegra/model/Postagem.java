package com.reintegra.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "postagens")

public class Postagem {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id; 
	
	@NotNull
	@Size(min=2,max=100)
	private String titulo;
	
	@NotNull
	@Size(min=2,max=500)
	private String texto;
	
	@NotNull
	@Size(min=2,max=100)
	private String area;
	
	@ManyToOne
	@JsonIgnoreProperties("postagens")
	private Tema temaRelacionado;
	
	@ManyToOne
	@JsonIgnoreProperties({"minhasPostagens"})
	private Usuario criador;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Tema getTema() {
		return temaRelacionado;
	}

	public void setTema(Tema temaRelacionado) {
		this.temaRelacionado = temaRelacionado;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
