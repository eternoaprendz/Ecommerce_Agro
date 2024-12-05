package br.integrado.Tech_academy4.model;

import jakarta.persistence.*;
import java.io.Serializable;


@Embeddable
public class ItemPedidoPK implements Serializable {

    @Column(name = "pedido_id")
    private Long pedidoId;

    @Column(name = "produto_id")
    private Long produtoId;

    // Getters e Setters
    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    // equals() e hashCode() são obrigatórios para chaves compostas
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPedidoPK that = (ItemPedidoPK) o;
        return pedidoId.equals(that.pedidoId) && produtoId.equals(that.produtoId);
    }

    @Override
    public int hashCode() {
        return 31 * pedidoId.hashCode() + produtoId.hashCode();
    }
}
