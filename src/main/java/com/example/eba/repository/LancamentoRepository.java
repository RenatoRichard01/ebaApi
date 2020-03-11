package com.example.eba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eba.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
