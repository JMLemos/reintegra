package com.projetomv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetomv.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
		
		public List<Endereco> findAllByLogradouroContainingIgnoreCase( String logradouro);
		

}
