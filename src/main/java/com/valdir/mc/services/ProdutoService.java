package com.valdir.mc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.valdir.mc.domain.Categoria;
import com.valdir.mc.domain.Produto;
import com.valdir.mc.repositories.CategoriaRepository;
import com.valdir.mc.repositories.ProdutoRepository;
import com.valdir.mc.services.exceptions.ObjectNotFoubdException;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;
	@Autowired
	private CategoriaRepository categoriaRepo;
	
	public Produto find(Integer id) {
		Optional<Produto> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoubdException(
				"Objeto não encontrado! ID: " + id + ", Tipo: " + Produto.class.getName()));
	}

	public Page<Produto> search(String nome, List<Integer> ids, Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, org.springframework.data.domain.Sort.Direction.valueOf(direction), orderBy);

		List<Categoria> categorias = categoriaRepo.findAllById(ids);
		
		return repo.search(nome, categorias, pageRequest);
	}

}
