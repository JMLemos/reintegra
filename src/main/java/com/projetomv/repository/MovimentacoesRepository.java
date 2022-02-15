package com.projetomv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetomv.model.Movimentacoes;

public interface MovimentacoesRepository extends JpaRepository<Movimentacoes, Long> {
	
	public List<Movimentacoes> findAllByIdMovimentacoes(long idMovimentacoes);


}
