package com.empresa.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long>{

}
