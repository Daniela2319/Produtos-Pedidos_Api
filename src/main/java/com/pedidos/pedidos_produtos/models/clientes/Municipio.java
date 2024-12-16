package com.pedidos.pedidos_produtos.models.clientes;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "municipio")
public class Municipio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmunicipio;
    private String nomeMunicipio;
    private Uf uf;
}
