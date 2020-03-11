package com.example.eba.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.eba.model.Pessoa;
import com.example.eba.repository.PessoaRepository;

//Essa classe será um compenente spring
@Service
public class PessoaService {
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa atualizar(Long codigo, Pessoa pessoa) {
		Pessoa pessoaSalva = buscarPessoaPeloCodigo(codigo);
		//copie essa propriedade de atualização(font, qual propriedade, ignorado o codigo)
		BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
		return pessoaRepository.save(pessoaSalva);
	}


	public void atualizarPropriedadeAtivo(Long codigo, boolean ativo) {
		Pessoa pessoaSalva = buscarPessoaPeloCodigo(codigo);
		pessoaSalva.setAtivo(ativo);
		pessoaRepository.save(pessoaSalva);
	}
	
	
	public Pessoa buscarPessoaPeloCodigo(Long codigo) {
		Pessoa pessoaSalva = pessoaRepository.findById(codigo).orElseThrow(() -> new EmptyResultDataAccessException(1));
		if (pessoaSalva == null) {
			//Lance essa execação em casos de não houver encontrado a referencia
			  throw new EmptyResultDataAccessException(1);
		}
		return pessoaSalva;
	}

}
