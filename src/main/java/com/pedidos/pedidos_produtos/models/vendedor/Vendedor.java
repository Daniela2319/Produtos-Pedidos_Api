package com.pedidos.pedidos_produtos.models.vendedor;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "vendedor")
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idvendedor;
    private String nomeVendedor;// termina de colocar as tabela
}
