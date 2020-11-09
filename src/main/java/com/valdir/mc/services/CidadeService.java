package com.valdir.mc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.valdir.mc.domain.Cidade;
import com.valdir.mc.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repo;

	@RequestMapping(method = RequestMethod.GET)
	public List<Cidade> findByEstado(Integer id) {
		return repo.findCidades(id);
	}

}
