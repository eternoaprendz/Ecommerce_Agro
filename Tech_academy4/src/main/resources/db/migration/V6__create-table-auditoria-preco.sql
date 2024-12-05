CREATE TABLE auditoria_preco (
    id INT PRIMARY KEY AUTO_INCREMENT,
    produto_id INT NOT NULL,
    preco_anterior DECIMAL(10, 2) NOT NULL,
    preco_novo DECIMAL(10, 2) NOT NULL,
    alterado_por VARCHAR(255),
    data_alteracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    FOREIGN KEY (produto_id) REFERENCES produtos(id)
);
