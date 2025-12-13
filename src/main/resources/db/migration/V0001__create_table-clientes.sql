CREATE TABLE clientes (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    endereco VARCHAR(255) NOT NULL,
    telefone VARCHAR(12),
    veiculo_id BIGINT,
    FOREIGN KEY (veiculo_id) REFERENCES veiculos(id)
);