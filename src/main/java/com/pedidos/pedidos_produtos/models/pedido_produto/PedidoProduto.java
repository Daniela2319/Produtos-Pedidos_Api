package com.pedidos.pedidos_produtos.models.pedido_produto;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;


@Embeddable
@Data
public class PedidoProduto implements Serializable {

    private Long idPedido;
    private Long idProduto;
    private Integer quantidade;
    private Double valorUnitario;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PedidoProduto that = (PedidoProduto) o;
        return Objects.equals(idPedido, that.idPedido) && Objects.equals(idProduto, that.idProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPedido, idProduto);
    }
}

