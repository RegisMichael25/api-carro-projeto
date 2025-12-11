CREATE TABLE estoque_pecas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_peca VARCHAR(255) NOT NULL,
    custo_unitario NUMERIC(10, 2) NOT NULL,
    quantidade_estoque INT NOT NULL
);