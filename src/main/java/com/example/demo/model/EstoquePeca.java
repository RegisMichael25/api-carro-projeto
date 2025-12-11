package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "estoque_pecas")
public class EstoquePeca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_peca", length = 255, nullable = false)
    private String nomePeca;

    @Column(name = "custo_unitario", nullable = false)
    private Float custoUnitario;

    @Column(name = "quantidade_estoque", nullable = false)
    private Integer quantidadeEstoque;
}
