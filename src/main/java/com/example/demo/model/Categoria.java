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
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_categoria", length = 255, nullable = false)
    private String nomeCategoria;

    @Column(name = "tempo_medio_horas", nullable = false)
    private Float tempoMedioHoras;

    @Column(name = "preco_mao_obra", nullable = false)
    private Float precoMaoObra;
}
