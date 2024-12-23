package com.pedidos.pedidos_produtos.repositorio.cliente;

import com.pedidos.pedidos_produtos.models.clientes.Profissao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfissaoRepository extends JpaRepository<Profissao, Long> {
}
