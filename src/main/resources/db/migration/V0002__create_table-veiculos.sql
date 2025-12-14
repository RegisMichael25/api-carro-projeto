CREATE TABLE veiculos (
    id SERIAL PRIMARY KEY,
    modelo VARCHAR(255) NOT NULL,
    data_aquisicao_cliente DATE NOT NULL,
    cliente_id int NOT NULL,
    FOREIGN KEY(cliente_id) REFERENCES clientes(id)
);