package com.pedidos.pedidos_produtos.repositorio.pedido_produto;

import com.pedidos.pedidos_produtos.models.pedido_produto.PedidoProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoProdutoRepositorio extends JpaRepository<PedidoProduto, Long> {
}
