CREATE TABLE pagamentos (
    id INT  PRIMARY key AUTO_INCREMENT ,
    pedido_id INT NOT NULL,
    metodo_pagamento ENUM('cartao', 'boleto', 'pix') NOT NULL,
    status ENUM('pendente', 'pago', 'falha') NOT NULL,
    valor DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (pedido_id) REFERENCES pedidos(id)
    );