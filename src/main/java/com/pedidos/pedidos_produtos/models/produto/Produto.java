package com.pedidos.pedidos_produtos.models.produto;

import com.pedidos.pedidos_produtos.models.fornecedor.Fornecedor;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;
    private String nomeProduto;
    private Double valor;
    @ManyToOne
    @JoinColumn(name = "idfornecedor", unique = true)
    private Fornecedor idFornecedor;
}
