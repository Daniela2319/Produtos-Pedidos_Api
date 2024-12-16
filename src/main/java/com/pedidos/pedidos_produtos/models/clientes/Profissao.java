package com.pedidos.pedidos_produtos.models.clientes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "profissao")
public class Profissao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idprofissao")
    private Long idprofissao;

    @Column(name = "nome", nullable = false, length = 50)
    private String nomeProfissao;
}
