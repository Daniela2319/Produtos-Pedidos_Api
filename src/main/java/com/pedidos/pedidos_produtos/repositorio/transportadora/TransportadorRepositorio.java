package com.pedidos.pedidos_produtos.repositorio.transportadora;

import com.pedidos.pedidos_produtos.models.transportadora.Transportadora;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportadorRepositorio extends JpaRepository<Transportadora, Long> {
}
