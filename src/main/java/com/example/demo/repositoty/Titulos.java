package com.example.demo.repositoty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long>  {
	
	public List<Titulo> findByDescricaoContaining(String descricao);
	
	

}
