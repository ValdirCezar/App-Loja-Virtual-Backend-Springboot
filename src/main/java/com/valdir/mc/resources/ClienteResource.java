package com.valdir.mc.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.valdir.mc.domain.Categoria;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> find() {
		List<Categoria> list = new ArrayList<>();
		
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		list.add(cat1);
		list.add(cat2);
		
		return list;
	}

}
