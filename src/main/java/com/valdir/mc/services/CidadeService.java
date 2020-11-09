package com.valdir.mc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.valdir.mc.domain.Cidade;
import com.valdir.mc.domain.Estado;
import com.valdir.mc.repositories.CidadeRepository;
import com.valdir.mc.services.exceptions.ObjectNotFoubdException;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repo;

	@RequestMapping(method = RequestMethod.GET)
	public List<Cidade> findByEstado(Integer id) {
		if(repo.findCidades(id).isEmpty()) {
			throw new ObjectNotFoubdException("Objeto não encontrado! id: " + id + ", Tipo: " + Estado.class.getName());
		}
		return repo.findCidades(id);
	}

}
