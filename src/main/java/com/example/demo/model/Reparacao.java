package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "reparacoes")
public class Reparacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "veiculos")
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name = "clientes")
    private Cliente cliente;

    @Column(name = "data_atendimento", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataAtendimento;

    @ManyToOne
    @JoinColumn(name = "funcionarios")
    private Funcionario funcionario;

    @Column(name = "valor_total", nullable = false)
    private double valorTotal;

    @Column(name = "tempo_atendimento", nullable = false)
    private double tempoAtendimento;

    @Column(name = "custo_funcionario", nullable = false)
    private double custoFuncionario;
}
