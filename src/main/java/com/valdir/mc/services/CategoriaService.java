package com.valdir.mc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdir.mc.domain.Categoria;
import com.valdir.mc.repositories.CategoriaRepository;
import com.valdir.mc.services.exceptions.ObjectNotFoubdException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria find(Integer id) {

		Optional<Categoria> obj = categoriaRepository.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoubdException(
				"Objeto não encontrado! ID:" + id + ", Tipo: " + Categoria.class.getName()));
	}

}
