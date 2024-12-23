package com.pedidos.pedidos_produtos.repositorio.produto;

import com.pedidos.pedidos_produtos.models.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {
}
