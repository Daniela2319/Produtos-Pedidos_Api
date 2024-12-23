package com.pedidos.pedidos_produtos.repositorio.fornecedor;

import com.pedidos.pedidos_produtos.models.fornecedor.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepositorio extends JpaRepository<Fornecedor, Long> {
}
