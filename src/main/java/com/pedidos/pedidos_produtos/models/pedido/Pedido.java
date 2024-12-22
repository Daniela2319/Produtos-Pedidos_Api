package com.pedidos.pedidos_produtos.models.pedido;

import com.pedidos.pedidos_produtos.models.clientes.Cliente;
import com.pedidos.pedidos_produtos.models.transportadora.Transportadora;
import com.pedidos.pedidos_produtos.models.vendedor.Vendedor;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Data
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;
    private Date dataPedido;
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "idcliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idtransportadora", nullable = false)
    private Transportadora transportadora;

    @ManyToOne
    @JoinColumn(name = "idvendedor", nullable = false)
    private Vendedor vendedor;
}
