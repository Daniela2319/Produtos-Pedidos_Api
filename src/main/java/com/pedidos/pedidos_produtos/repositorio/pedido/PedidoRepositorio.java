package com.pedidos.pedidos_produtos.repositorio.pedido;

import com.pedidos.pedidos_produtos.models.pedido.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {
}
