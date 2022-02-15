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

import com.projetomv.model.Conta;
import com.projetomv.repository.ContaRepository;

@RestController
@RequestMapping("/conta")
@CrossOrigin("*")
public class ContaController {
	
	@Autowired
	private ContaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Conta>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Conta> post(@Valid @RequestBody Conta numConta){
		return ResponseEntity.status(HttpStatus.CREATED).body(this.repository.save(numConta));
	}

	@PutMapping
	public ResponseEntity<Conta> put(@Valid @RequestBody Conta numConta){
		return ResponseEntity.status(HttpStatus.OK).body(this.repository.save(numConta));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long idConta) {
		this.repository.deleteById(idConta);
	}

}
