CREATE TABLE reparacoes (
    id SERIAL PRIMARY KEY,
    veiculo_id INT NOT NULL,
    cliente_id INT NOT NULL,
    data_atendimento DATE NOT NULL,
    funcionario_id INT NOT NULL,
    valor_total NUMERIC(10, 2) NOT NULL,
    tempo_atendimento NUMERIC(10,2) NOT NULL,
    custo_funcionario NUMERIC(10,2) NOT NULL,
    FOREIGN KEY (veiculo_id) REFERENCES veiculos (id),
    FOREIGN KEY (cliente_id) REFERENCES clientes (id),
    FOREIGN KEY (funcionario_id) REFERENCES funcionarios (id)
);