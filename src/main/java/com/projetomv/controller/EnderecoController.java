package com.projetomv.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetomv.model.Endereco;
import com.projetomv.repository.EnderecoRepository;

@RestController
@RequestMapping("/endereco")
@CrossOrigin("*")
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Endereco>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Endereco> post(@Valid @RequestBody Endereco logradouro){
		return ResponseEntity.status(HttpStatus.CREATED).body(this.repository.save(logradouro));
	}

	@PutMapping
	public ResponseEntity<Endereco> put(@Valid @RequestBody Endereco logradouro){
		return ResponseEntity.status(HttpStatus.OK).body(this.repository.save(logradouro));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long idEndereco) {
		this.repository.deleteById(idEndereco);
	}


}
