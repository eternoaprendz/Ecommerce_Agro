
CREATE TABLE pedidos (
    id INT PRIMARY key AUTO_INCREMENT ,
    usuario_id INT NOT NULL,
    total DECIMAL(10, 2) NOT NULL,
    data_criacao TIMESTAMP,
    data_atualizacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
    );