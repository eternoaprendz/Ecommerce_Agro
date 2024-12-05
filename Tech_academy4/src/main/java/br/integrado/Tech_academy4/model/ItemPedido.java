package br.integrado.Tech_academy4.model;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "itens_pedido")
public class ItemPedido {

    @EmbeddedId
    private ItemPedidoPK id;

    @ManyToOne
    @MapsId("pedidoId") // Relaciona a chave composta com o pedido
    @JoinColumn(name = "pedido_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Pedido pedido;

    @ManyToOne
    @MapsId("produtoId") // Relaciona a chave composta com o produto
    @JoinColumn(name = "produto_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Produto produto;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(name = "preco_unitario", nullable = false, precision = 10, scale = 2)
    private BigDecimal precoUnitario;

    // Getters e Setters
    public ItemPedidoPK getId() {
        return id;
    }

    public void setId(ItemPedidoPK id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
