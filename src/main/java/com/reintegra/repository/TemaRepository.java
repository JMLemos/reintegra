package com.reintegra.repository;

import java.util.List;


import com.reintegra.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
	
	
	public List<Tema> findAllByAreas(String areas);

}