package com.pedidos.pedidos_produtos.models.fornecedor;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "fornecedor")
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfornecedor;
    private String nomeFornecedor;
}
