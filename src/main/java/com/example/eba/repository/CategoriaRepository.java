package com.example.eba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eba.model.Categoria;
//Traz varios metodos do banco de dados
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
