package com.example.eba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eba.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
