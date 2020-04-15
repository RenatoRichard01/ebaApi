package com.example.eba.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eba.modell.Lancamento;
import com.example.eba.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}