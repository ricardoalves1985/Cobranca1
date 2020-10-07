package com.example.demo.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long>  {

}
