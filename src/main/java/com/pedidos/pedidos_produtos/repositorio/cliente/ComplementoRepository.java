package com.pedidos.pedidos_produtos.repositorio.cliente;

import com.pedidos.pedidos_produtos.models.clientes.Complemento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplementoRepository extends JpaRepository<Complemento, Long> {
}
