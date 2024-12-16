package com.pedidos.pedidos_produtos.models.fonecedor;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "fornecedor")
public class Forncedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfornecedor;
    private String nomeFornecedor;
}
