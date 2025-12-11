package com.example.demo.model;

import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@Table(name = "pecas_utilizadas")
public class PecaUtilizada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "reparacoes")
    private Reparacao reparacao;

    @ManyToOne
    @JoinColumn(name = "estoque_pecas")
    private EstoquePeca estoquePeca;

    @Column(name = "quantidade_utilizada")
    private Integer quantidadeUtilizada = 1;
}

