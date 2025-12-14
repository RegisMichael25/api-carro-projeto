CREATE TABLE pecas_utilizadas (
    id SERIAL PRIMARY KEY,
    reparacoes_id INT NOT NULL,
    estoque_pecas_id INT NOT NULL,
    quantidade_utilizada INT NOT NULL DEFAULT 1,
    FOREIGN KEY (reparacoes_id) REFERENCES reparacoes (id),
    FOREIGN KEY (estoque_pecas_id) REFERENCES estoque_pecas (id)
);