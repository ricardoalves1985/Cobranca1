package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.example.demo.model.Titulo;
import com.example.demo.repositoty.Titulos;

@Service
public class CadastroTituloServices {
	
	@Autowired
	private Titulos titulos;
	
	public void salvar(Titulo titulo) {
		
		try {
		titulos.save(titulo);
		
		}catch(DataIntegrityViolationException e) {
			throw new IllegalArgumentException("Formato de data invalido!");
		}
	}

	public void excluir(Long codigo) {
		titulos.deleteById(codigo);
		
	}

}
