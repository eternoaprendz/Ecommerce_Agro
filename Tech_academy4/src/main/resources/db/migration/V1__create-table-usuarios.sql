CREATE TABLE usuarios (
    id INT PRIMARY KEY AUTO_INCREMENT ,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    telefone VARCHAR(20),
    endereco TEXT
    );