package com.pedidos.pedidos_produtos.repositorio.vendedor;

import com.pedidos.pedidos_produtos.models.vendedor.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepositorio extends JpaRepository<Vendedor, Long> {
}
