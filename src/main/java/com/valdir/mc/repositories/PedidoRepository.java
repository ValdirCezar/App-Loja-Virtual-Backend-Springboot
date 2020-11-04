package com.valdir.mc.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valdir.mc.domain.Cliente;
import com.valdir.mc.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

	Page<Pedido> findByCliente(Cliente cliente, Pageable pageRequest);
	
}
