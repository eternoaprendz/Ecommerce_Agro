CREATE TABLE produtos (
    id INT  PRIMARY key AUTO_INCREMENT ,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    preco DECIMAL(10, 2) NOT NULL,
    quantidade_estoque INT NOT NULL,
    categoria_id INT,
    imagem_url VARCHAR(255),

    FOREIGN KEY (categoria_id) REFERENCES categorias(id)
);
