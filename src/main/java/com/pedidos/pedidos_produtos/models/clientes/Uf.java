package com.pedidos.pedidos_produtos.models.clientes;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "uf")
public class Uf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iduf;
    private String nomeUf;
    private String sigla;
}
