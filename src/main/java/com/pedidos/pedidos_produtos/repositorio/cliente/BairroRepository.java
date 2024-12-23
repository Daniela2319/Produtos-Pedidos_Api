package com.pedidos.pedidos_produtos.repositorio.cliente;

import com.pedidos.pedidos_produtos.models.clientes.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BairroRepository extends JpaRepository<Bairro, Long> {
}
