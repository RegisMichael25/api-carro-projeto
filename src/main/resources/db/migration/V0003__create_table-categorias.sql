CREATE TABLE categorias (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome_categoria VARCHAR(255) NOT NULL,
    tempo_medio_horas NUMERIC(10, 2) NOT NULL,
    preco_mao_obra NUMERIC(10, 2) NOT NULL
);