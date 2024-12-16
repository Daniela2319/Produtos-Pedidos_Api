package com.pedidos.pedidos_produtos.models.transportadora;

import com.pedidos.pedidos_produtos.models.clientes.Municipio;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "transportadora")
public class Transportadora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idtransportadora;
    private String nomeTransportadora;
    @ManyToOne
    @JoinColumn(name = "id_municipio", nullable = false) // Chave estrangeira para Municipio
    private Municipio idmunicipio;
    private String logradouro;
    private int numero;

}
