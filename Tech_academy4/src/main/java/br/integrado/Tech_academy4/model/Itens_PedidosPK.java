package br.integrado.Tech_academy4.model;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Itens_PedidosPK {
}



    @Column(name = "pedido_id")
    private Integer pedidoId;

    @Column(name = "produto_id")
    private Integer produtoId;

    public Integer getPedidoId() {
        return pedidoId;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieActorPK that = (MovieActorPK) o;
        return Objects.equals(movieId, that.movieId) && Objects.equals(actorId, that.actorId);
    }

    public int hashCode() {
        return Objects.hash(movieId, actorId);
    }
}