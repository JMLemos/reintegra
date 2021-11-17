package com.reintegra.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reintegra.model.Usuario;
import com.reintegra.repository.UsuarioRepository;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository nomeCompleto;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> GetAll(){
		return ResponseEntity.ok(nomeCompleto.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> GetById(@PathVariable long id){
		return nomeCompleto.findById(id)
				.map(response -> ResponseEntity.ok(response))
				.orElse(ResponseEntity.notFound().build());
	} 
	
	@PostMapping
	public ResponseEntity<Usuario> post(@Valid @RequestBody Usuario nomeCompleto){
		return ResponseEntity.status(HttpStatus.CREATED).body(this.nomeCompleto.save(nomeCompleto));
	}

	@PutMapping
	public ResponseEntity<Usuario> put(@Valid @RequestBody Usuario nomeCompleto){
		return ResponseEntity.status(HttpStatus.OK).body(this.nomeCompleto.save(nomeCompleto));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		this.nomeCompleto.deleteById(id);
	}


}
