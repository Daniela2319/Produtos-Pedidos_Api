package com.pedidos.pedidos_produtos.repositorio.cliente;

import com.pedidos.pedidos_produtos.models.clientes.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

}

