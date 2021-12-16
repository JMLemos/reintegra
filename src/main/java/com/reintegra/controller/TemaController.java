package com.reintegra.controller;

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

import com.reintegra.model.Tema;
import com.reintegra.repository.TemaRepository;

@RestController
@RequestMapping("/tema")
@CrossOrigin("*")
public class TemaController {

	@Autowired
	private TemaRepository areas;
	
	@GetMapping
	public ResponseEntity<List<Tema>> GetAll(){
		return ResponseEntity.ok(areas.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Tema> GetById(@PathVariable long id){
		return areas.findById(id)
				.map(response -> ResponseEntity.ok(response))
				.orElse(ResponseEntity.notFound().build());
	
	} 

	@PostMapping
	public ResponseEntity<Tema> post(@Valid @RequestBody Tema areas){
		return ResponseEntity.status(HttpStatus.CREATED).body(this.areas.save(areas));
	}

	@PutMapping
	public ResponseEntity<Tema> put(@Valid @RequestBody Tema areas){
		return ResponseEntity.status(HttpStatus.OK).body(this.areas.save(areas));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		this.areas.deleteById(id);
	}
}
