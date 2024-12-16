package com.pedidos.pedidos_produtos.models.clientes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "complemento")
public class Complemento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcomplemento;

    private String nomeComplemento;
}
