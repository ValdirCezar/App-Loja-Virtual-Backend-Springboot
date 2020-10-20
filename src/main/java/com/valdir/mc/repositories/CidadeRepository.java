package com.valdir.mc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdir.mc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
