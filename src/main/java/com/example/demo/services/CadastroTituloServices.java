package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.example.demo.model.StatusTitulo;
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

	public String receber(Long codigo) {
		Titulo titulo = titulos.getOne(codigo); // recebi o codigo
		titulo.setStatus(StatusTitulo.RECEBIDO); // Atualizei status
		titulos.save(titulo); // mando salvar o titulo
		
		return StatusTitulo.RECEBIDO.getDescricao();
		
	}

}
