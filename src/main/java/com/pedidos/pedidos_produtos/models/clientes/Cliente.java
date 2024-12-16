package com.pedidos.pedidos_produtos.models.clientes;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

    @Entity
    @Data
    @Table(name = "cliente") // Nome da tabela no banco de dados
    public class Cliente {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração automática do ID
        @Column(name = "idcliente") // Nome da coluna no banco de dados
        private Long idCliente;

        @Column(name = "nome", nullable = false, length = 100) // Nome do cliente
        private String nome;

        @Column(name = "data_nascimento", nullable = false) // Data de nascimento
        private LocalDate dataNascimento;

        @Column(name = "rg", length = 20) // Documento RG
        private String rg;

        @Column(name = "cpf", nullable = false, unique = true, length = 11) // Documento CPF
        private String cpf;

        @Column(name = "genero", length = 20) // Gênero do cliente
        private String genero;

        @ManyToOne // Relacionamento com a entidade Profissao muitos para um
        @JoinColumn(name = "idprofissao", unique = true) // Chave estrangeira para profissão
        private Profissao profissao;

        @ManyToOne // Relacionamento com a entidade Bairro
        @JoinColumn(name = "idbairro", unique = true) // Chave estrangeira para bairro
        private Bairro bairro;

        @ManyToOne // Relacionamento com a entidade Complemento
        @JoinColumn(name = "idcomplemento", unique = true) // Chave estrangeira para complemento
        private Complemento complemento;

        @ManyToOne
        @JoinColumn(name = "idmunicipio",unique = true)
        private Municipio municipio;
        @ManyToOne
        @JoinColumn(name = "iduf", unique = true)
        private Uf uf;

    }



