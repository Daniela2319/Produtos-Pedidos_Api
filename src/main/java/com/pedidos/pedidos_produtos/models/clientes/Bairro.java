package com.pedidos.pedidos_produtos.models.clientes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "bairro")
public class Bairro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idBairro;

    private String nomeBairro;

}
