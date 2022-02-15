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

import com.projetomv.repository.MovimentacoesRepository;
import com.projetomv.model.Movimentacoes;

@RestController
@RequestMapping("/movimentacoes")
@CrossOrigin("*")
public class MovimentacoesController {
	
	@Autowired
	private MovimentacoesRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Movimentacoes>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Movimentacoes> post(@Valid @RequestBody Movimentacoes idMovimentacoes){
		return ResponseEntity.status(HttpStatus.CREATED).body(this.repository.save(idMovimentacoes));
	}

	@PutMapping
	public ResponseEntity<Movimentacoes> put(@Valid @RequestBody Movimentacoes idMovimentacoes){
		return ResponseEntity.status(HttpStatus.OK).body(this.repository.save(idMovimentacoes));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long idMovimentacoes) {
		this.repository.deleteById(idMovimentacoes);
	}
	
	
}
