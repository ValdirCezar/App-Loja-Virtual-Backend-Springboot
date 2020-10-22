package com.valdir.mc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdir.mc.domain.Pedido;
import com.valdir.mc.repositories.PedidoRepository;
import com.valdir.mc.services.exceptions.ObjectNotFoubdException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = pedidoRepository.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoubdException(
				"Objeto não encontrado! ID: " + id + ", Tipo: " + Pedido.class.getName()));
	}

}
