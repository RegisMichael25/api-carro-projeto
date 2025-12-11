package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @author Regis Michael
 * @since 2025-10-24
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "veiculos")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "modelo_carro", nullable = false)
    private String modelo;

    @Column(name = "data_aquisicao_cliente", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataAquisicaoCliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clientes")
    private Cliente cliente;
}