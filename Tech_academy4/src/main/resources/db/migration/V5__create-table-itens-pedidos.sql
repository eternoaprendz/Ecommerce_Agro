CREATE TABLE itens_pedido (
    pedido_id INT,
    produto_id INT,
    PRIMARY KEY (pedido_id, produto_id),
    quantidade INT NOT NULL,
    preco_unitario DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (pedido_id) REFERENCES pedidos(id),
    FOREIGN KEY (produto_id) REFERENCES produtos(id)
);
